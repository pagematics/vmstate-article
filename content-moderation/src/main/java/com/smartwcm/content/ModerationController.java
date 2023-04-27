package com.smartwcm.content;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smartwcm.content.image.ImageModerationService;
import com.smartwcm.content.text.TextModerationService;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@AutoConfiguration
@ComponentScan("com.smartwcm.content")
@RequestMapping("contentmoderation")
public class ModerationController 
{
	@Autowired
	TextModerationService textModerationService; 
	
	@Autowired
	ImageModerationService imageModerationService; 
	
	private static final Logger	logger	= LoggerFactory.getLogger(ModerationController.class);
	
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
    public TextModerationResponseHB moderateTextInput(@ModelAttribute("comment") String comment, @RequestParam("language") String language, @RequestParam("checkPII") boolean checkPII, @RequestParam("checkProfanity") boolean checkProfanity) throws IOException 
    {
		logger.info("The comment data: "+comment+" is checking for: PII = "+checkPII+", Profanity = "+checkProfanity);
    	TextModerationResponseHB textModerationResponseHB = textModerationService.moderateText(comment, language, checkPII, checkProfanity);
    	logger.info("Text moderation result for the comment: "+comment+ "is: "+"profanityReviewRecommended = "+textModerationResponseHB.ispIIReviewRecommended()+", pIIReviewRecommended = "+textModerationResponseHB.ispIIReviewRecommended());
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
		logger.info("The image url: "+imageurl+" is checking for adult and racy content");
		ImageModerationResponseHB imageModerationResponseHB = imageModerationService.moderateImage(imageurl, checkImage);
		logger.info("Image moderation result for the image: "+imageurl+ "is: "+"imageReviewRequired = "+imageModerationResponseHB.isImageReviewRequired());
		return imageModerationResponseHB;
    }

}
