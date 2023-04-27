package com.smartwcm.content.text;


import com.smartwcm.content.TextModerationResponseHB;

public interface TextModerationService 
{
	/**
	 * This method is to check a text for profanity and PII
	 * @param comment: Data to be moderated.
	 * @param language:It indicates the language of the input text. It is a string value. 
	 * @param checkPII: This is a boolean value to give information on whether we need to check for profanity or not.
	 * @param checkProfanity: This is also a boolean value to indicate whether we need to check for PII in the given text or not.

	 * @return
	 */
	public TextModerationResponseHB moderateText(String comment, String language, boolean checkPII, boolean checkProfanity);
}
