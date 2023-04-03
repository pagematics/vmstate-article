package vmstate.designpattern.abstractfactory.case002;

public class WindowsButton implements Button {

	@Override
	public void createUI() {
		System.out.println("You have created WindowsButton.");
	}

}
