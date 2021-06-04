package car_dealership;

public class Customer {

	private String name;
	private String address;
	private double cashOnHand;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address += " Dealership city";//Encapsulation, hiding this data, dealership person don't  know whats going on, hee sees only address but its appending this to the address this information hiding
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		cashOnHand += 500;
		this.cashOnHand = cashOnHand;
	}
	
	public void purchaseCar(Vehicle vehical, Employee emp, boolean finance) {
		emp.handleCustomer(this, finance, vehical);
	}
}
