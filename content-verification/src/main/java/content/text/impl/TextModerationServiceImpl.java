package content.text.impl;


import org.springframework.stereotype.Service;

import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ContentModeratorClient;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ContentModeratorManager;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AzureRegionBaseUrl;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Screen;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.ScreenTextOptionalParameter;

import content.TextModerationResponseHB;
import content.text.TextModerationService;

@Service("textModerationService")
public class TextModerationServiceImpl implements TextModerationService
{
	private static final String SUBSCRIPTION_KEY = "bd65975c08974a7130d76";
	private static final String ENDPOINT = "https:/cognitiveservices.azure.com/";
	
	@Override
	public TextModerationResponseHB moderateText(String comment, String language, boolean checkPII, boolean checkProfanity)
	{
		TextModerationResponseHB textModerationResponseHB = new TextModerationResponseHB();
		Screen textResults = null;
		ScreenTextOptionalParameter options = new ScreenTextOptionalParameter();
    	options.withLanguage(language);
    	options.withPII(checkPII);
    	options.withClassify(checkProfanity);
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
        return textModerationResponseHB;
        
	}

}
