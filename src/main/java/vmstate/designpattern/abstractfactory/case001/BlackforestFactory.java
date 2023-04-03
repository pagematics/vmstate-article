package vmstate.designpattern.abstractfactory.case001;

public class BlackforestFactory implements CakeAbstractFactory
{
	private String flavour;
	private String color;
	
	public BlackforestFactory(String flavour, String color)
	{
		this.flavour=flavour;
		this.color=color;
	}
	
	@Override
	public Cake createCake() 
	{
		return new Blackforest(flavour,color);
	}
}
