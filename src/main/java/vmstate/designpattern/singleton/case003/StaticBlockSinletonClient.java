package vmstate.designpattern.singleton.case003;

public class StaticBlockSinletonClient 
{
	public static void main(String[] args) 
	{
		StaticBlockSingleton staticBlockSingletonObject1 = StaticBlockSingleton.getInstance();
		staticBlockSingletonObject1.doSomething();
		System.out.println("staticBlockSingletonObject1 hashcode: "+staticBlockSingletonObject1.hashCode());
		
		StaticBlockSingleton staticBlockSingletonObject2 = StaticBlockSingleton.getInstance();
		staticBlockSingletonObject2.doSomething();
		System.out.println("staticBlockSingletonObject2 hashcode: "+staticBlockSingletonObject2.hashCode());
	}

}
