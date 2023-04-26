package content.image.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ContentModeratorClient;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ContentModeratorManager;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AzureRegionBaseUrl;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.BodyModelModel;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.EvaluateUrlInputOptionalParameter;
import content.EvaluationData;
import content.ImageModerationResponseHB;
import content.image.ImageModerationService;

@Service("imageModerationService")
public class ImageModerationServiceImpl implements ImageModerationService
{
	private static final String SUBSCRIPTION_KEY = "bd65975c089746a6a7d446f8a7130d76";
	private static final String ENDPOINT = "https://pagematics.cognitiveservices.azure.com/";

	@Override
	public ImageModerationResponseHB moderateImage(String imageurl, boolean imageReviewRequired) 
	{
		ImageModerationResponseHB imageModerationResponseHB = new ImageModerationResponseHB();
		ContentModeratorClient client = ContentModeratorManager.authenticate(AzureRegionBaseUrl.fromString(ENDPOINT), SUBSCRIPTION_KEY);
        BodyModelModel url = new BodyModelModel();
        url.withDataRepresentation("URL");
        url.withValue(imageurl);
        List<EvaluationData> resultsList = new ArrayList<EvaluationData>();
        EvaluationData imageData = new EvaluationData();
        imageData.ImageUrl = url.value();
        imageData.ImageModeration = client.imageModerations().evaluateUrlInput("application/json", url, new EvaluateUrlInputOptionalParameter().withCacheImage(true));
        resultsList.add(imageData);
        if ((imageData.ImageModeration.isImageAdultClassified()==true)||(imageData.ImageModeration.isImageRacyClassified()==true))
        {
        	imageModerationResponseHB.setImageReviewRequired(true);
        }
        return imageModerationResponseHB;
	}
	 

}
