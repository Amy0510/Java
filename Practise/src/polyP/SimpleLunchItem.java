package polyP;
import java.text.*;

public class SimpleLunchItem implements MenuItem {

	private String name;
	private double price;
	
	public SimpleLunchItem(String aName, double aPrice) {
		// TODO Auto-generated constructor stub
		name = aName;
	    price = aPrice;
	}

	@Override
	public String getName() {return name;}

	@Override
	public double getPrice() {return price;}
	
	 public String toString ()
	   {
	      DecimalFormat money = new DecimalFormat("0.00");
	      return getName() + " " + money.format(getPrice());
	   }

}
