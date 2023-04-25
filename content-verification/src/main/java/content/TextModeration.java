package content;
public class TextModeration 
{
	private String language;
    private Boolean autocorrect;
    private Boolean pII;
    private String listId;
    private Boolean classify;
	public String getLanguage()
	{
		return language;
	}
	public void setLanguage(String language)
	{
		this.language = language;
	}
	public Boolean getAutocorrect()
	{
		return autocorrect;
	}
	public void setAutocorrect(Boolean autocorrect)
	{
		this.autocorrect = autocorrect;
	}
	public Boolean getpII()
	{
		return pII;
	}
	public void setpII(Boolean pII)
	{
		this.pII = pII;
	}
	public String getListId()
	{
		return listId;
	}
	public void setListId(String listId)
	{
		this.listId = listId;
	}
	public Boolean getClassify()
	{
		return classify;
	}
	public void setClassify(Boolean classify)
	{
		this.classify = classify;
	}

}
