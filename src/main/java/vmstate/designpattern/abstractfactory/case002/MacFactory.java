package vmstate.designpattern.abstractfactory.case002;

public class MacFactory extends GUIFactory
{
	public Button createButton() {
    	return new MacButton();
	}

	public TextBox createTextBox() {
    	return new MacTextBox();
	}
}
