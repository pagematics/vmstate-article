package content;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import content.image.ImageModerationService;
import content.text.TextModerationService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@AutoConfiguration
@ComponentScan("content")
@RequestMapping("contentmoderation")
public class ModerationController 
{
	@Autowired
	TextModerationService textModerationService; 
	
	@Autowired
	ImageModerationService imageModerationService; 
	
	/**
	 * This method is to check a text for profanity and PII
	 * @param comment
	 * @param language
	 * @param checkPII
	 * @param checkPIIcheckProfanity
	 * @return
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping(value ="/text-moderation", method = RequestMethod.POST, headers = "Accept=application/json")
    public TextModerationResponseHB moderateTextInput(@ModelAttribute("comment") String comment, @RequestParam("language") String language, @RequestParam("checkPII") boolean checkPII, @RequestParam("checkPII") boolean checkProfanity) throws IOException 
    {
    	TextModerationResponseHB textModerationResponseHB = textModerationService.moderateText(comment, language, checkPII, checkProfanity);
    	return textModerationResponseHB;
    }
	
	/**
	 * This method is to check an image for adult and racy content
	 * @param imageurl
	 * @param checkImage
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value ="/image-moderation", method = RequestMethod.POST, headers = "Accept=application/json")
    public ImageModerationResponseHB moderateImageInput(@ModelAttribute("imageurl") String imageurl, @RequestParam("checkImage") boolean checkImage)
    {
		ImageModerationResponseHB imageModerationResponseHB = imageModerationService.moderateImage(imageurl, checkImage);
		return imageModerationResponseHB;
    }

}
