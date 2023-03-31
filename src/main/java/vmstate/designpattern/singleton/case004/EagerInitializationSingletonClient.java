package vmstate.designpattern.singleton.case004;

public class EagerInitializationSingletonClient 
{
	public static void main(String[] args) {
		
		EagerInitializationSingleton eagerInitializationSingletonObject1 = EagerInitializationSingleton.getInstance();
		eagerInitializationSingletonObject1.doSomething();
		System.out.println("eagerInitializationSingletonObject1 hashcode: "+eagerInitializationSingletonObject1.hashCode());
		
		EagerInitializationSingleton eagerInitializationSingletonObject2 = EagerInitializationSingleton.getInstance();
		eagerInitializationSingletonObject2.doSomething();
		System.out.println("eagerInitializationSingletonObject2 hashcode: "+eagerInitializationSingletonObject2.hashCode());
		
		EagerInitializationSingleton eagerInitializationSingletonObject3 = EagerInitializationSingleton.getInstance();
		eagerInitializationSingletonObject3.doSomethingDifferent();
		System.out.println("eagerInitializationSingletonObject3 hashcode: "+eagerInitializationSingletonObject3.hashCode());
	}
}
