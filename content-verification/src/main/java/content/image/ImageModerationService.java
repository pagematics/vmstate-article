package content.image;

import content.ImageModerationResponseHB;

public interface ImageModerationService 
{
	/**
	 * This method is to check an image for adult and racy content
	 * @param imageurl
	 * @param imageReviewRequired
	 * @return
	 */
	public ImageModerationResponseHB moderateImage(String imageurl, boolean imageReviewRequired);
}
