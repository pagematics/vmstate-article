package vmstate.designpattern.singleton.case004;

public class EagerInitializationSingleton 
{
	 // creating instance of the singleton class
    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();
    // private constructor to avoid client applications using the constructor
    private EagerInitializationSingleton()
    {
    	
    }
    // public method to access the instance from outside
    public static EagerInitializationSingleton getInstance()
    {
        return instance;
    }
    // methods of the Eager Initialization Singleton class
    public void doSomething() {
        System.out.println("Eager Initialization Singleton doSomething");
    }
    public void doSomethingDifferent() {
        System.out.println("Eager Initialization Singleton doSomething different");
    }
}
