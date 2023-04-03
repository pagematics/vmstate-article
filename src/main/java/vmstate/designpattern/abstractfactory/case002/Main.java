package vmstate.designpattern.abstractfactory.case002;


public class Main 
{
	public static void main(String[] args) {
		Application app;
    	GUIFactory factory;
		String currentPlatform = "Windows";
		if (currentPlatform.equalsIgnoreCase("Windows")) {
        	factory = new WindowsFactory();
    	} else if (currentPlatform.equalsIgnoreCase("Mac")) {
        	factory = new MacFactory();
    	} else {
        	factory = new LinuxFactory();
    	}
    	//app = new Application(factory);
    	//app.createUI();
	}


}
