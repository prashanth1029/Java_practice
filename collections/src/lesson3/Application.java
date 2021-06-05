package lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {

		HashSet<Integer> values = new HashSet<Integer>();//it won't have duplicates if duplicates only takes one element,the insert and the order is not maintained here
		//,only it cares is it should not contain duplicates order is random here, it contains unique values
		//ArraySet<Integer> values = new ArraySet<Integer>();//it ca have duplicates, and the order is maintained here
		values.add(12);
		values.add(22);
		values.add(32);
		values.add(42);
		values.add(12);
		
		for (Integer integer : values) {
			System.out.println(integer);
		}
		
		LinkedHashSet<String> value = new LinkedHashSet<String>();
		//it maintains insertion order and unique elements both, that duplicates are not allowed here also
		value.add("random");
		value.add("zoo");
		value.add("car");
		value.add("random");
		value.add("random");
		
		for (String string : value) {
			System.out.println(string);
		}
		
		HashSet<Animal> animals = new HashSet<Animal>();
		//now its not able to manage unique values, bcz its not able to consider both objects are equal to corre it we need to oveeride equals method 
		Animal animal1 = new Animal("lion",12);
		Animal animal2 =new Animal("lion",12);
		animals.add(animal1);
		animals.add(animal2);
		animals.add(new Animal("deer",22));
		animals.add(new Animal("bear",32));
		animals.add(new Animal("buffalo",42));
		animals.add(new Animal("bull",52));
		
		//after overriding hashcode and equals it will consider it as same
		
		System.out.println(animal1.equals(animal2));
		
		//hashset runs on basis of hashset	so we need to override hashcode implimentation too	
		//these are the values (hashcodes) used by hashset conside wheather same object or not
		System.out.println(animal1.hashCode());
		System.out.println(animal2.hashCode());
		
		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}

}
