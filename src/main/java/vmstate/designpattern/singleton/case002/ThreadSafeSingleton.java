package vmstate.designpattern.singleton.case002;

public class ThreadSafeSingleton {
    // static variable to hold the single instance of the Singleton class
    private static ThreadSafeSingleton instance;

    // private constructor to prevent direct instantiation of the class
    private ThreadSafeSingleton() {}

    // static method to get the single instance of the Singleton class
    // The singleton class can be made thread safe by making the global access method synchronised
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    // methods of the Singleton class
    public void doSomething() {
        System.out.println("ThreadSafeSingleton in doSomething method");
    }
}
