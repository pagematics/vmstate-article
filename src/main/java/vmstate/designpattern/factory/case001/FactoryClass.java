package vmstate.designpattern.factory.case001;

public class FactoryClass 
{
	public static FactorySuperClass getFactorySuperClass(String type, String object1, String object2, String object3)
	{
		if("FactorySubclass1".equalsIgnoreCase(type)) 
		{
			return new FactorySubclass1(object1, object2, object3);
		}
		else if("FactorySubclass2".equalsIgnoreCase(type))
		{
			return new FactorySubclass2(object1, object2, object3);
		}
		else
		{
			return null;
		}
	}	

}
