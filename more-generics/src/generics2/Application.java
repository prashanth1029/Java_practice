package generics2;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee());
		ArrayList<Accountant> accountant = new ArrayList<Accountant>();
		accountant.add(new Accountant());
		//employees = accountant;//we can't think the same way when we dealing with generics classes, bcz its a generic class that relationship breaks apart when we deeling with generics
		
		ArrayList<Object> employees1 = new ArrayList<Object>();//even thogh Object class same thing it doesn't allow bcz the generics promises typesafety
		ArrayList<Accountant> accountant1 = new ArrayList<Accountant>();
		//employees1 = accountant1;//even thogh Object class same thing it doesn't allow bcz the generics promises typesafety
		
		//we can do that with using wild cards
		ArrayList<?> emp2 = new ArrayList<>();
		ArrayList<Accountant> acc2 = new ArrayList<Accountant>();//if we change it to string also it will allow
		//ArrayList<String> acc2 = new ArrayList<String>();
		emp2 = acc2;// now its allowing ? implies anydata type it's a valid code
		
		ArrayList<? extends Employee> emp3 = new ArrayList<>();//here ? repersents the all child class of employees
		ArrayList<Accountant> acc3 = new ArrayList<Accountant>();
//		ArrayList<Object> acc3 = new ArrayList<Object>(); it not allow bcz of obvious object is not sub class of employee
		emp3 = acc3;
		//the above 3 lines work if Employee is interface also here the extends key refers to highest type
		//the above 3 lines work if Employee is class also here the extends key refers to highest type
		
		ArrayList<? super Employee> emp4 = new ArrayList<>();//here ? repersents employee or the all parent class of employees, it prevents subclasses here
		ArrayList<Object> acc4 = new ArrayList<Object>();
		//ArrayList<Accountant> acc4 = new ArrayList<Accountant>(); gives error
		emp4 = acc4;
		
		makeEmployeeWork(employees);
		//makeEmployeeWork(accountant); it's not acceptable
		
		makeEmployeeWork(employees);//employee and it's childrens or allowed here now
		makeEmployeeWork(accountant); //we can do this by making it to extend like uncommented method
		
	}
	
//	public static void makeEmployeeWork(List<Employee> employees) {
//		
//		for (Employee employee : employees) {
//			employee.work();
//		}
//	}

	public static void makeEmployeeWork(List<? extends Employee> employees) {
		
		for (Employee employee : employees) {
			//employee.work();
		}
	}

}
