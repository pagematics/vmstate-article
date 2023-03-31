package vmstate.designpattern.factory.case001;

public class FactoryClient 
{
	public static void main(String[] args) 
	{
		FactorySuperClass factorySubclass1 = FactoryClass.getFactorySuperClass("FactorySubclass1", "Object1-f1", "Object2-f1", "Object3-f1");
		FactorySuperClass factorySubclass2 = FactoryClass.getFactorySuperClass("FactorySubclass2","Object1-f2","Object2-f2","Object3-f2");
		System.out.println("Factory Subclass1 Config::"+factorySubclass1);
		System.out.println("Factory Subclass2 Config::"+factorySubclass2);
	}
}
