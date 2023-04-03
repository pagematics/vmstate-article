package vmstate.designpattern.abstractfactory.case002;

public class MacTextBox implements TextBox {

	@Override
	public void createUI() {
		System.out.println("You have created Mac TextBox");
	}

}
