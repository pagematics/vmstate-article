package vmstate.designpattern.singleton.case003;

public class StaticBlockSingleton
{
		private static final StaticBlockSingleton INSTANCE;
		
		static {
	    	try {
	        	INSTANCE = new StaticBlockSingleton();
	    	} catch (Exception e) {
	        	throw new RuntimeException("Error occurred while creating singleton instance");
	    	}
		}

		private StaticBlockSingleton() {
	    	// private constructor to prevent instantiation
		}

		public static StaticBlockSingleton getInstance() {
	    	return INSTANCE;
		}
		 public void doSomething() {
		        System.out.println("StaticBlockSingleton in doSomething method");
		    }
}
