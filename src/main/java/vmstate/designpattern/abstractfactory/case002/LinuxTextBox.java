package vmstate.designpattern.abstractfactory.case002;

public class LinuxTextBox implements TextBox {

	@Override
	public void createUI() {
		System.out.println("You have created Linux TextBox");
	}

}
