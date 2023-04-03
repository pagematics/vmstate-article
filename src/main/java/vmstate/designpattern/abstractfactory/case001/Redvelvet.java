package vmstate.designpattern.abstractfactory.case001;

public class Redvelvet extends Cake
{
	private String flavour;
	private String color;
	
	public Redvelvet(String flavour, String color)
	{
		this.flavour = flavour;
		this.color = color;
	}

	@Override
	public String getFlavour() 
	{
		return this.flavour;
	}

	@Override
	public String getColor() 
	{
		return this.color;
	}
}
