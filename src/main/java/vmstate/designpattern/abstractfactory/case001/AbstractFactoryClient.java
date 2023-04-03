package vmstate.designpattern.abstractfactory.case001;

public class AbstractFactoryClient 
{
	public static void main(String[] args) {
		abstractFactoryClient();
	}

	private static void abstractFactoryClient() 
	{
		Cake blackforest = CakeFactory.getCake(new BlackforestFactory("chocolate", "black"));
		Cake redvelvet = CakeFactory.getCake(new RedvelvetFactory("vanila","red"));
		System.out.println("AbstractFactory Blackforest ::"+blackforest);
		System.out.println("AbstractFactory Redvelvet ::"+redvelvet);
	}
}
