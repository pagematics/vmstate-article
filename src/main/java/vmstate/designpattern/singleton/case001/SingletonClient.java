package vmstate.designpattern.singleton.case001;



public class SingletonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton singletonInstance1 = Singleton.getInstance();
		singletonInstance1.doSomething();
		System.out.println("singletonInstance1 hashcode: "+singletonInstance1.hashCode());
		
		Singleton singletonInstance2 = Singleton.getInstance();
		singletonInstance2.doSomething();
		System.out.println("singletonInstance2 hashcode: "+singletonInstance2.hashCode());
	}

}
