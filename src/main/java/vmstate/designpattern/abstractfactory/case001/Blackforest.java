package vmstate.designpattern.abstractfactory.case001;

public class Blackforest extends Cake
{
	private String flavour;
	private String color;
	
	public Blackforest(String flavour, String color)
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
