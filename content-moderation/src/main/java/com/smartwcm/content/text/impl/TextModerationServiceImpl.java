package com.smartwcm.content.text.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ContentModeratorClient;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ContentModeratorManager;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AzureRegionBaseUrl;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Screen;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.ScreenTextOptionalParameter;
import com.smartwcm.content.TextModerationResponseHB;
import com.smartwcm.content.text.TextModerationService;

@Service("textModerationService")
public class TextModerationServiceImpl implements TextModerationService
{
	private static final String SUBSCRIPTION_KEY = "bd6597446f8a7130d76";
	private static final String ENDPOINT = "https://.cognitiveservices.azure.com/";
	private static final Logger	logger	= LoggerFactory.getLogger(TextModerationServiceImpl.class);
	
	@Override
	public TextModerationResponseHB moderateText(String comment, String language, boolean checkPII, boolean checkProfanity)
	{
		TextModerationResponseHB textModerationResponseHB = new TextModerationResponseHB();
		Screen textResults = null;
		ScreenTextOptionalParameter options = new ScreenTextOptionalParameter();
    	options.withLanguage(language);
    	options.withPII(checkPII);
    	options.withClassify(checkProfanity);
    	logger.debug("The comment: "+comment+"is undergoing content moderation with parameters: PII = "+checkPII+", Profanity = "+checkProfanity);
		ContentModeratorClient client = ContentModeratorManager.authenticate(AzureRegionBaseUrl.fromString(ENDPOINT), SUBSCRIPTION_KEY);
        textResults = client.textModerations().screenText("text/plain", comment.getBytes(), options);
        if (textResults.pII()!=null)
        {
        	textModerationResponseHB.setpIIReviewRecommended(true);
        }
        if(textResults.classification().reviewRecommended()==true)
        {
        	textModerationResponseHB.setProfanityReviewRecommended(true);
        }
        logger.debug("Text moderation result for the comment: "+comment+ "is: "+"profanityReviewRecommended = "+textModerationResponseHB.ispIIReviewRecommended()+", pIIReviewRecommended = "+textModerationResponseHB.ispIIReviewRecommended());
        return textModerationResponseHB;
        
	}

}
