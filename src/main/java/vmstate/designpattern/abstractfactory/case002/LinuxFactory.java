package vmstate.designpattern.abstractfactory.case002;

public class LinuxFactory extends GUIFactory
{
	public Button createButton() {
    	return new LinuxButton();
	}

	public TextBox createTextBox() {
    	return new LinuxTextBox();
	}

}
