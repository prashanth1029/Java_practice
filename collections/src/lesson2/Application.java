package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<String> animals = new ArrayList<String>();
		//ArrayList<String> animals = new ArrayList<String>();
		//the thing in <> these angle brackets can't be primitive , it should be class or an interface
		animals.add("lion");
		animals.add("Tiger");
		animals.add("Dog");
		animals.add("Bird");
		
		/*
		 * for(int i= 0; i < animals.size(); i++) { System.out.println(animals.get(i));
		 * }
		 * 
		 * System.out.println("second approach"); for(String val : animals) { //syntax
		 * data type of the things we need to traverse and its reference after : symbol
		 * //we can use this for each loop for arraylists as well as arrays and other
		 * collections also System.out.println(val); }
		 */
		
		//LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
		List<Vehicle> vehicles = new LinkedList<Vehicle>();
		//ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle vehicle2 = new Vehicle("Toyota","Camry",12000,false);//one way of initialising objects
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Honda","Accord",12000,false));//another way of initialising objects in oneline
		vehicles.add(new Vehicle("Jeep","Wrangler",25000,true));
		
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
			System.out.println(vehicle.getMake());
			System.out.println(vehicle.getModle());
			System.out.println(vehicle.getPrice());
		}
		
		printElements(vehicles);
		printElements(animals);
	}
	
	public static void printElements(List SomeList) {
		for(int i= 0; i < SomeList.size(); i++) { 
			System.out.println(SomeList.get(i));
		}
	}

}
