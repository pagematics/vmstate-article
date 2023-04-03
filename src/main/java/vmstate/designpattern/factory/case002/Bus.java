package vmstate.designpattern.factory.case002;

//Bus class implementing the Vehicle interface
public class Bus implements Vehicle {
	@Override
	public void drive() {
 	System.out.println("Driving a bus.");
	}
}