package vmstate.designpattern.abstractfactory.case002;

public class LinuxButton implements Button {

	@Override
	public void createUI() {
		System.out.println("You have created LinuxButton.");
	}

}
