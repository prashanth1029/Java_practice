package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		
		ArrayList<Integer> newlist = new ArrayList<Integer>();
		
		newlist.add(121);
		newlist.add(122);
		newlist.add(124);
		newlist.add(125);
		newlist.add(126);
		newlist.add(128);
		
		list1.addAll(newlist);//padds all items from newlist to list1
		System.out.println(list1);
		
		list1.removeAll(newlist);//removes all items from list1 which are padded from newlist
		System.out.println(list1);
		
		boolean hasValue = list1.contains(43);//returns boolean value whether contains value 43
		System.out.println(hasValue);
		
		boolean hasValue1 = list1.contains(140);//returns boolean value whether contains value 140
		System.out.println(hasValue1);
		
		boolean isEmpty = list1.isEmpty();//returns boolean value whether list is empty or not
		System.out.println(isEmpty);
		
		System.out.println(list1);
		boolean retainAll = list1.retainAll(newlist);
		System.out.println(list1);
		System.out.println(retainAll);
		
		list1.clear();//remove alll items from list1
		System.out.println(list1);
		
		//converting a hashset into arraylist
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(12);
		hashSet.add(43);
		hashSet.add(15);
		hashSet.add(67);
		hashSet.add(43);
		
		List<Integer> li = new ArrayList<Integer>(hashSet);
		
		//sorting hashset
		//Collections.sort(hashSet);
	    // i can't pass in the hashset to the collections sort method bcz the collections sort method accepts only a list
		//converting hashset into a arraylist
		ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);//now this mylist contains all of the data that hashset contains
		Collections.sort(myList);
		System.out.println(myList);
		
		//the data type must be same as hashset datatype from above that is Integer
		
		HashSet<String> hashSetStr = new HashSet<String>();
		hashSetStr.add("Random");
		hashSetStr.add("Tooth Brush");
		hashSetStr.add("arun");
		hashSetStr.add("cloths");
		hashSetStr.add("computer");
		
		//List<String> liStr = new ArrayList<String>(hashSetStr);
		
		//sorting hashset
		//Collections.sort(hashSet);
	    // i can't pass in the hashset to the collections sort method bcz the collections sort method accepts only a list
		//converting hashset into a arraylist
		ArrayList<String> myListStr = new ArrayList<String>(hashSetStr);//now this mylist contains all of the data that hashset contains
		Collections.sort(myListStr);
		System.out.println(myListStr);
		
		HashSet<Employee> emp = new HashSet<Employee>();
		emp.add(new Employee("Saravanan", 100000, "Delivary"));
		emp.add(new Employee("Vishal", 10000, "Operations"));
		emp.add(new Employee("Pavan", 1000, "Operations"));
		emp.add(new Employee("Prashanth", 1050000, "Dilevery"));
		emp.add(new Employee("Sheik", 14000, "Delivery"));
		
		ArrayList<Employee> empList = new ArrayList<Employee>(emp);
		Collections.sort(empList);
		System.out.println(empList);
		
	}

}
