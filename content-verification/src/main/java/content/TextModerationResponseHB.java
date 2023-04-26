package content;

public class TextModerationResponseHB 
{
	 private boolean profanityReviewRecommended;
	 private boolean pIIReviewRecommended;
	public boolean isProfanityReviewRecommended() 
	{
		return profanityReviewRecommended;
	}
	public void setProfanityReviewRecommended(boolean profanityReviewRecommended) 
	{
		this.profanityReviewRecommended = profanityReviewRecommended;
	}
	public boolean ispIIReviewRecommended()
	{
		return pIIReviewRecommended;
	}
	public void setpIIReviewRecommended(boolean pIIReviewRecommended) 
	{
		this.pIIReviewRecommended = pIIReviewRecommended;
	}

}
