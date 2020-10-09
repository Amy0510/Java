package polyP;

public class Trio implements MenuItem {
	private Sandwich san;
	private Salad sal;
	private Drink d;

	public Trio(Sandwich san1, Salad sal1, Drink d1) {
		// TODO Auto-generated constructor stub
		this.san = san1;
		this.sal = sal1;
		this.d = d1;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return san.getName() + "/" + sal.getName() + "/" + d.getName() + " Trio";
	}

	@Override
	public double getPrice() {
		if(san.getPrice() < sal.getPrice() && san.getPrice()<d.getPrice()) {
			return sal.getPrice() + d.getPrice();
		}
		if(sal.getPrice() < san.getPrice() && sal.getPrice()<d.getPrice()) {
			return san.getPrice() + d.getPrice();
		}
		return sal.getPrice() + san.getPrice();
	
		
	}
	
	public boolean istrue() {
		return true;
	}

}
