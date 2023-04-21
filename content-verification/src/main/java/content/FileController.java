package content;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ContentModeratorClient;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ContentModeratorManager;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AzureRegionBaseUrl;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.BodyModelModel;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Screen;

import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FileController {
	
	private static final String SUBSCRIPTION_KEY = "b693520ec4908d32bb43818920";
	private static final String ENDPOINT = ".cognitiveservices.azure.com/";
	
    @PostMapping("/check-file")
    public void checkFile(@RequestParam("file") MultipartFile file) throws IOException 
    {
    	String extension = StringUtils.getFilenameExtension(file.getOriginalFilename());
    	
    	ContentModeratorClient client = ContentModeratorManager.authenticate(AzureRegionBaseUrl.fromString(ENDPOINT),
    			SUBSCRIPTION_KEY);
    	try 
    	{
    		if (extension.contains("txt")||extension.contains("pdf")||extension.contains("docx"))
        	{
        	File textFile = new File( file.getOriginalFilename() );
        	FileOutputStream fos = new FileOutputStream( textFile );
            fos.write( file.getBytes() );
            fos.close();
            Screen textResults = null;
            textResults = client.textModerations().screenText("text/plain", textFile.toString().getBytes(), null);
            System.out.println("Text moderation status: " + textResults.status().description());
            System.out.println();
        	}
            
        } 
    	catch (Exception e) 
    	{
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    	
    	try 
    	{
    			String urlString = "https://moderatorsampleimages.blob.core.windows.net/samples/sample2.jpg";
                // Evaluate each line of text
                BodyModelModel url = new BodyModelModel();
                file.getOriginalFilename();
                url.withDataRepresentation("URL");
                url.withValue(urlString);
                
                
                List<EvaluationData> resultsList = new ArrayList<EvaluationData>();
                // Save to EvaluationData class for later
                EvaluationData imageData = new EvaluationData();
                imageData.ImageUrl = url.value();
                // Evaluate for adult and racy content.
                imageData.ImageModeration = client.imageModerations().evaluateUrlInput("application/json", url,
                        new EvaluateUrlInputOptionalParameter().withCacheImage(true));
                Thread.sleep(1000);
                // Detect and extract text from image.
                imageData.TextDetection = client.imageModerations().oCRUrlInput("eng", "application/json", url,
                        new OCRUrlInputOptionalParameter().withCacheImage(true));
                Thread.sleep(1000);
                // Detect faces.
                imageData.FaceDetection = client.imageModerations().findFacesUrlInput("application/json", url,
                        new FindFacesUrlInputOptionalParameter().withCacheImage(true));
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
