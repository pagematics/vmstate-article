package vmstate.designpattern.factory.case002;

//Vehicle Factory class
public class VehicleFactory {
	public Vehicle createVehicle(String vehicleType) {
 	if(vehicleType.equalsIgnoreCase("car")) {
     	return new Car();
 	} else if(vehicleType.equalsIgnoreCase("bus")) {
     	return new Bus();
 	} else {
     	return null; // or throw an exception
 	}
	}
}