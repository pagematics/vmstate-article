package vmstate.designpattern.facade.case001;

public class Apple implements ComputerShop {

	@Override
	public void getComputerRAM() {
		System.out.println("Apple: RAM is: 8");
	}

	@Override
	public void getComputerPrice() {
		System.out.println("Price is: 2000");
	}

}
