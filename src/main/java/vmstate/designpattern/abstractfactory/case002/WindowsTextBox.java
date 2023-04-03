package vmstate.designpattern.abstractfactory.case002;

public class WindowsTextBox implements TextBox {

	@Override
	public void createUI() {
		System.out.println("You have created Windows TextBox");
	}

}
