package com.smartwcm.content.text;


import com.smartwcm.content.TextModerationResponseHB;

public interface TextModerationService 
{
	/**
	 * This method is to check a text for profanity and PII
	 * @param comment
	 * @param language
	 * @param checkPII
	 * @param checkProfanity
	 * @return
	 */
	public TextModerationResponseHB moderateText(String comment, String language, boolean checkPII, boolean checkProfanity);
}
