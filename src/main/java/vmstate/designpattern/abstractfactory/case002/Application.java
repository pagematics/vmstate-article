package vmstate.designpattern.abstractfactory.case002;

public class Application {
	private GUIFactory factory;

	public Application(GUIFactory factory) {
    	this.factory = factory;
	}

	public void createUI() {
    	Button button = factory.createButton();
    	TextBox textBox = factory.createTextBox();

    	// Use the button and text box to create the UI
	}


}
