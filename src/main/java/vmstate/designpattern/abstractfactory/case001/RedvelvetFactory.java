package vmstate.designpattern.abstractfactory.case001;

public class RedvelvetFactory implements CakeAbstractFactory
{
	private String flavour;
	private String color;
	
	
	public RedvelvetFactory(String flavour, String color)
	{
		this.flavour=flavour;
		this.color=color;
	}
	
	@Override
	public Cake createCake() 
	{
		return new Redvelvet(flavour,color);
	}

}
