package vmstate.designpattern.singleton.case002;

public class Singleton {
	   private static volatile Singleton instance = null;

	   private Singleton() {
	      // private constructor
	   }

	   public static Singleton getInstance() {
	      if (instance == null) {
	         synchronized (Singleton.class) {
	            if (instance == null) {
	               instance = new Singleton();
	            }
	         }
	      }
	      return instance;
	   }
	}