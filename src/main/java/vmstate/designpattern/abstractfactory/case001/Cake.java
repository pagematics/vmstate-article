package vmstate.designpattern.abstractfactory.case001;

public abstract class Cake 
{
	   public abstract String getFlavour();
	   public abstract String getColor();
	   
	   @Override
	    public String toString(){
	        return "Flavour= "+this.getFlavour()+", Color="+this.getColor();
	    }
}
