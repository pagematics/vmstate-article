package vmstate.designpattern.factory.case002;

//Car class implementing the Vehicle interface
public class Car implements Vehicle {
	@Override
	public void drive() {
    	System.out.println("Driving a car.");
	}
}