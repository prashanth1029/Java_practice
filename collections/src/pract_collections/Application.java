package pract_collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();
		//arraylist is a resizable array if it got full,its automatically doubles its size and cpoies all elements to new array with more free allocated memory
		words.add("hey");
		words.add("hello");
		words.add("there");
		words.add("this");
		words.add("is");
		
		String item1 = words.get(2);
		System.out.println(item1);
		
		//the deafult starting size of the arraylist is 10 slots,if 10 allocation fills or as soon as we try to put 11th item , its automatically doubles(20) 
		//after 20 fills if we try to add 21th element becomes 40 and copies elements from previous array
		//we can not put primitive data type in the angle brackets
		//bcz primitive data types don't have class associated with them, String is class so we can put it
		//for primitives we need to put wrapper class
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		//numbers.add("sdjfgjfdg");
		numbers.add(10);
		numbers.add(20);
		numbers.add(40);
		numbers.add(50);
		numbers.remove(2);
		numbers.removeFirst();
		numbers.removeLast();
		
		for(int num : numbers) {
			System.out.println(num);
		}
		
		
		LinkedList<Double> dbl = new LinkedList<Double>();
		
		LinkedList<Float> flt = new LinkedList<Float>();
		
		LinkedList<Character> ch = new LinkedList<Character>();
		
		ArrayList all = new ArrayList();
		all.add("hello");
		all.add("hey");
		all.add(10);
		all.add(20);
		all.add('a');
		all.add(21.21f);
		all.add(4555400l);
		
		//String var = words.get(0);
		String var = (String)all.get(0);//bcz its a object returned from arraylist
		int var1 = (int)all.get(3);
		Object obj = all.get(5);
		Object obj1 = all.get(5);
		//System.out.println(obj + obj1);
		
	}

}
