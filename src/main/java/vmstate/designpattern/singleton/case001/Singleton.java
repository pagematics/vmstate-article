package vmstate.designpattern.singleton.case001;

public class Singleton {
    // static variable to hold the single instance of the Singleton class
    private static Singleton instance;

    // private constructor to prevent direct instantiation of the class
    private Singleton() {}

    // static method to get the single instance of the Singleton class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // methods of the Singleton class
    public void doSomething() {
        System.out.println("Singleton doSomething");
    }
}
