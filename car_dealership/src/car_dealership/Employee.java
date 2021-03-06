package car_dealership;

public class Employee {

	String empName;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void handleCustomer(Customer cst, boolean finance, Vehicle vehicle) {
		if(finance) {
			double loanAmount = vehicle.price - cst.getCashOnHand();
			runCreditHistory(cst, loanAmount);
		}
		else if(vehicle.price <= cst.getCashOnHand()) {
//			customer pays in cash
			processTransaction(cst, vehicle);
		}			
		else
			System.out.println("bring more money to purchase your vehicle: " + vehicle);
	}
	
	public void runCreditHistory(Customer cst, double loanAmount) {
		System.out.println("ran credit history for Customer....");
		System.out.println("Customer has been approved to purchase the vehicle");
	}
	
	public void processTransaction(Customer cst, Vehicle vehicle) {
		System.out.println(cst.getName() + " has purchased the vehicle " + vehicle + " for the price " + vehicle.price);
	}
}
