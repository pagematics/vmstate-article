package vmstate.designpattern.multiton.case001;

public class MultitonClient {
    public static void main(String[] args) {
        Multiton instance1 = Multiton.getInstance("First Instance");
        Multiton instance2 = Multiton.getInstance("Second Instance");
        Multiton instance3 = Multiton.getInstance("Third Instance");
        
        System.out.println(instance1.getName()); 
        System.out.println(instance2.getName()); 
        System.out.println(instance3.getName()); 
    }
}

