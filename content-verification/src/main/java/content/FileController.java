package content;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ContentModeratorClient;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ContentModeratorManager;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AzureRegionBaseUrl;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.BodyModelModel;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Screen;

import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
@AutoConfiguration
@ComponentScan("content")
public class FileController 
{
	@Autowired
	CommentService commentService;
	
	private static final String SUBSCRIPTION_KEY = "bd65975a7130d76";
	private static final String ENDPOINT = "https://cognitiveservices.azure.com/";
	
	@RequestMapping(value ="/text-moderation", method = RequestMethod.POST, headers = "Accept=application/json")
    public void moderateText(@RequestParam("file") MultipartFile file, @RequestParam("textmoderation") String textmoderation) throws IOException 
    {
    	ContentModeratorClient client = ContentModeratorManager.authenticate(AzureRegionBaseUrl.fromString(ENDPOINT), SUBSCRIPTION_KEY);
    	ObjectMapper mapper = new ObjectMapper();
    	TextModeration textmoderationRules = mapper.readValue(textmoderation, TextModeration.class);
    	ScreenTextOptionalParameter options = new ScreenTextOptionalParameter();
    	options.withLanguage(textmoderationRules.getLanguage());
    	options.withAutocorrect(textmoderationRules.getAutocorrect());
    	options.withPII(textmoderationRules.getpII());
    	options.withClassify(textmoderationRules.getClassify());
    	try 
    	{
        	File textFile = new File( file.getOriginalFilename() );
        	FileOutputStream fos = new FileOutputStream( textFile );
            fos.write( file.getBytes() );
            fos.close();
            Screen textResults = null;
            textResults = client.textModerations().screenText("text/plain", file.getBytes(), options);
            if (textResults.pII()!=null)
            {
            	System.out.println("Text contains PII");
            }
            else
            {
            	System.out.println("Text moderation status: " + textResults.status().description());
            }
            CommentTO comment = new CommentTO();
            comment.setCommentData("new");
            commentService.saveOrUpdateComment(comment);
        } 
    	catch (Exception e) 
    	{
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    @PostMapping("/image-moderation")
    public void moderateImage(@RequestParam("file") MultipartFile file) throws IOException 
    {
    	ContentModeratorClient client = ContentModeratorManager.authenticate(AzureRegionBaseUrl.fromString(ENDPOINT), SUBSCRIPTION_KEY);
    	try 
    	{
        	File textFile = new File( file.getOriginalFilename() );
        	FileOutputStream fos = new FileOutputStream( textFile );
            fos.write( file.getBytes() );
            fos.close();
			String urlString = "https://moderatorsampleimages.blob.core.windows.net/samples/sample2.jpg";
            // Evaluate each line of text
            BodyModelModel url = new BodyModelModel();
            url.withDataRepresentation("URL");
            url.withValue(urlString);
            List<EvaluationData> resultsList = new ArrayList<EvaluationData>();
            // Save to EvaluationData class for later
            EvaluationData imageData = new EvaluationData();
            imageData.ImageUrl = url.value();
            // Evaluate for adult and racy content.
            imageData.ImageModeration = client.imageModerations().evaluateUrlInput("application/json", url, new EvaluateUrlInputOptionalParameter().withCacheImage(true));
            Thread.sleep(1000);
            // Detect and extract text from image.
            imageData.TextDetection = client.imageModerations().oCRUrlInput("eng", "application/json", url, new OCRUrlInputOptionalParameter().withCacheImage(true));
            Thread.sleep(1000);
            // Detect faces.
            imageData.FaceDetection = client.imageModerations().findFacesUrlInput("application/json", url, new FindFacesUrlInputOptionalParameter().withCacheImage(true));
            Thread.sleep(1000);
            resultsList.add(imageData);
            System.out.println("Image moderation status: " + imageData.ImageModeration.status().description());
            System.out.println();
        } 
    	catch (Exception e) 
    	{
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
