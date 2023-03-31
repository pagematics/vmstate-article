package vmstate.designpattern.singleton.case004;
import java.lang.reflect.Constructor;

public class ReflectionSingletonClient 
{
    public static void main(String[] args) 
    {
    	EagerInitializationSingleton reflectionSingletonInstance1 = EagerInitializationSingleton.getInstance();
    	EagerInitializationSingleton reflectionSingletonInstance2 = null;
        try 
        {
            Constructor[] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) 
            {
                // This code will destroy the singleton pattern
                constructor.setAccessible(true);
                reflectionSingletonInstance2 = (EagerInitializationSingleton) constructor.newInstance();
                break;
            }
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        reflectionSingletonInstance1.doSomething();
        System.out.println("reflectionSingletonInstance1 hashcode: "+reflectionSingletonInstance1.hashCode());
        reflectionSingletonInstance2.doSomething();
        System.out.println("reflectionSingletonInstance2 hashcode: "+reflectionSingletonInstance2.hashCode());
    }
}
