package vmstate.designpattern.singleton.case001;

public class LazySingletonClient 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LazySingleton lazySingletonInstance1 = LazySingleton.getInstance();
		lazySingletonInstance1.doSomething();
		System.out.println("lazy singletonInstance1 hashcode: "+lazySingletonInstance1.hashCode());
		
		LazySingleton lazySingletonInstance2 = LazySingleton.getInstance();
		lazySingletonInstance2.doSomething();
		System.out.println("lazy singletonInstance2 hashcode: "+lazySingletonInstance2.hashCode());
	}

}
