package com.smartwcm.content.image.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ContentModeratorClient;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ContentModeratorManager;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AzureRegionBaseUrl;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.BodyModelModel;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.EvaluateUrlInputOptionalParameter;
import com.smartwcm.content.EvaluationData;
import com.smartwcm.content.ImageModerationResponseHB;
import com.smartwcm.content.image.ImageModerationService;
import com.smartwcm.content.text.impl.TextModerationServiceImpl;

@Service("imageModerationService")
public class ImageModerationServiceImpl implements ImageModerationService
{
	private static final String SUBSCRIPTION_KEY = "bd65975c046f8a7130d76";
	private static final String ENDPOINT = "https://.cognitiveservices.azure.com/";
	private static final Logger	logger	= LoggerFactory.getLogger(ImageModerationServiceImpl.class);

	@Override
	public ImageModerationResponseHB moderateImage(String imageurl, boolean checkImage) 
	{
		ImageModerationResponseHB imageModerationResponseHB = new ImageModerationResponseHB();
		ContentModeratorClient client = ContentModeratorManager.authenticate(AzureRegionBaseUrl.fromString(ENDPOINT), SUBSCRIPTION_KEY);
        BodyModelModel url = new BodyModelModel();
        url.withDataRepresentation("URL");
        url.withValue(imageurl);
        List<EvaluationData> resultsList = new ArrayList<EvaluationData>();
        EvaluationData imageData = new EvaluationData();
        imageData.ImageUrl = url.value();
        logger.debug("The image url: "+imageurl+" is checking for adult and racy content");
        imageData.ImageModeration = client.imageModerations().evaluateUrlInput("application/json", url, new EvaluateUrlInputOptionalParameter().withCacheImage(true));
        resultsList.add(imageData);
        if ((imageData.ImageModeration.isImageAdultClassified()==true)||(imageData.ImageModeration.isImageRacyClassified()==true))
        {
        	imageModerationResponseHB.setImageReviewRequired(true);
        }
        logger.debug("Image moderation result for the image: "+imageurl+ "is: "+"imageReviewRequired = "+imageModerationResponseHB.isImageReviewRequired());
        return imageModerationResponseHB;
	}
	 

}
