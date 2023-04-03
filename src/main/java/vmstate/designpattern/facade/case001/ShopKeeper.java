package vmstate.designpattern.facade.case001;

public class ShopKeeper {
    private ComputerShop apple;
    private ComputerShop dell;
    private ComputerShop acer;
   
    public ShopKeeper() {
    	apple = new Apple();
    	dell = new Dell();
    	acer = new Acer();
    }

    public void appleSale() {
    	apple.getComputerRAM();
    	apple.getComputerPrice();
    }

    public void dellSale() {
    	dell.getComputerRAM();
    	dell.getComputerPrice();
    }

    public void acerSale() {
        acer.getComputerRAM();
        acer.getComputerPrice();
    }
}
