package vmstate.designpattern.facade.case001;

public class Acer implements ComputerShop{
	@Override
	public void getComputerRAM() {
		System.out.println("Acer : RAM is: 8");
	}

	@Override
	public void getComputerPrice() {
		System.out.println("Price is: 500");
	}
}
