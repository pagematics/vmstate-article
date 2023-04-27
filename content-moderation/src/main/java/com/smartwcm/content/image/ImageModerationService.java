package com.smartwcm.content.image;

import com.smartwcm.content.ImageModerationResponseHB;

public interface ImageModerationService 
{
	/**
	 * This method is to check an image for adult and racy content
	 * @param imageurl
	 * @param checkImage: This is a boolean parameter to check whether the image to be reviewed or not.
	 * @return
	 */
	public ImageModerationResponseHB moderateImage(String imageurl, boolean checkImage);
}
