package vmstate.designpattern.factory.case001;

public class FactorySubclass1 extends FactorySuperClass
{
	private String object1;
	private String object2;
	private String object3;
	
	public FactorySubclass1(String object1, String object2, String object3)
	{
		this.object1 = object1;
		this.object2 = object2;
		this.object3 = object3;
	}
	@Override
	public String getObject1() 
	{
		return this.object1;
	}

	@Override
	public String getObject2() 
	{
		return this.object2;
	}

	@Override
	public String getObject3() 
	{
		return this.object3;
	}
}
