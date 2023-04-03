package vmstate.designpattern.abstractfactory.case001;

public class CakeFactory 
{
	public static Cake getCake(CakeAbstractFactory factory)
	{
		return factory.createCake();
	}

}
