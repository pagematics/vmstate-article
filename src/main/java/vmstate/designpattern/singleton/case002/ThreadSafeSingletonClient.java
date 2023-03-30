package vmstate.designpattern.singleton.case002;



public class ThreadSafeSingletonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadSafeSingleton threadSafeSingletonObject1 = ThreadSafeSingleton.getInstance();
		threadSafeSingletonObject1.doSomething();
		System.out.println("threadSafeSingletonObject1 hashcode: "+threadSafeSingletonObject1.hashCode());
		
		ThreadSafeSingleton threadSafeSingletonObject2 = ThreadSafeSingleton.getInstance();
		threadSafeSingletonObject2.doSomething();
		System.out.println("threadSafeSingletonObject2 hashcode: "+threadSafeSingletonObject2.hashCode());
	}

}
