package vmstate.designpattern.abstractfactory.case002;


public class Main 
{
	public static void main(String[] args) {
    	GUIFactory factory;
    	String currentPlatform = null;
		if (currentPlatform  == Platform.WINDOWS) {
        	factory = new WindowsFactory();
    	} else if (currentPlatform == Platform.MAC) {
        	factory = new MacFactory();
    	} else {
        	factory = new LinuxFactory();
    	}
    	Application app = new Application(factory);
    	app.createUI();
	}


}
