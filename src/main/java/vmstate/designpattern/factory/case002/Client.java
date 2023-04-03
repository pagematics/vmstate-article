package vmstate.designpattern.factory.case002;

//Client code
public class Client {
	public static void main(String[] args) {
 	VehicleFactory factory = new VehicleFactory();

 	// Create a car
 	Vehicle car = factory.createVehicle("car");
 	car.drive(); // Output: Driving a car.

 	// Create a bus
 	Vehicle bus = factory.createVehicle("bus");
 	bus.drive(); // Output: Driving a bus.
	}
}	