package vmstate.designpattern.facade.case001;

public class Dell implements ComputerShop{
	
	@Override
	public void getComputerRAM() {
		System.out.println("Dell : RAM is: 8");
	}

	@Override
	public void getComputerPrice() {
		System.out.println("Price is: 600");
	}
}
