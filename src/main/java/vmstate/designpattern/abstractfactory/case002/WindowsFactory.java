package vmstate.designpattern.abstractfactory.case002;

public class WindowsFactory extends GUIFactory
{
	public Button createButton() {
    	return new WindowsButton();
	}

	public TextBox createTextBox() {
    	return new WindowsTextBox();
	}

}
