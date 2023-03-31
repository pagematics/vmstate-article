package vmstate.designpattern.singleton.case001;

public class LazySingleton {
    // static variable to hold the single instance of the Singleton class
    private static LazySingleton instance;

    // private constructor to prevent direct instantiation of the class
    private LazySingleton() {}

    // static method to get the single instance of the Singleton class
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    // methods of the Singleton class
    public void doSomething() {
        System.out.println("Lazy Singleton doSomething");
    }
}
