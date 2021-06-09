package generics2;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {

		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		ArrayList<Accountant> accountant = new ArrayList<Accountant>();
		//employees = accountant;//we can't think the same way when we dealing with generics classes, bcz its a generic class that relationship breaks apart when we deeling with generics
		
		ArrayList<Object> employees1 = new ArrayList<Object>();//even thogh Object class same thing it doesn't allow bcz the generics promises typesafety
		ArrayList<Accountant> accountant1 = new ArrayList<Accountant>();
		//employees1 = accountant1;//even thogh Object class same thing it doesn't allow bcz the generics promises typesafety
		
		//we can do that with using wild cards
		ArrayList<?> emp2 = new ArrayList<>();
		ArrayList<Accountant> acc2 = new ArrayList<Accountant>();//if we change it to string also it will allow
		//ArrayList<String> acc2 = new ArrayList<String>();
		emp2 = acc2;// now its allowing ? implies anydata type it's a valid code
		
	}

}
