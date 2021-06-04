package car_dealership;

public class Dealership {

	public static void main(String[] args) {

		Customer cst1 = new Customer();
		cst1.setAddress("111 koppal jawahar road");
		cst1.setName("Nagendra");
		cst1.setCashOnHand(120000);
		
		Vehicle vehicle = new Vehicle("BMW", "BLACK", 18000);
	
		Employee emp = new Employee();
		emp.setEmpName("Manoj");
		
		cst1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("BMW", "BLACK", 18000);
		
		cst1.purchaseCar(car, emp, false);
		
		boolean value = car.equals(vehicle);
		System.out.println(value);
	}

}
