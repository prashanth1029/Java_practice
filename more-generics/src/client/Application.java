package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {

//		ArrayList mylist = new ArrayList();
//		mylist.add("hello");
//		mylist.add(100);
//		mylist.add(false);
//		
//		String myval = (String)mylist.get(0);
//		String myval1 = (String)mylist.get(1);//at this index, it has intiger but java didn't figured it out, bcz we are casting it to string basically fooling java by casting
		
		
		/*
		 * ArrayList<String> mylist = new ArrayList(); mylist.add("hello");
		 * mylist.add(100); mylist.add(false);
		 * 
		 * String myval = (String)mylist.get(0); String myval1 = (String)mylist.get(1);
		 */
		
		//Container container = new Container(12, "hello");
		//int myvar = container.getItem1(); it won't allow us it must be Object type
		//Object myvar = container.getItem1();//it's somewhat generic bcz for this we can pass int string long ,but its not type safe
		//String myvar = (String)container.getItem1();//at this index, it has intiger but java didn't figured it out, bcz we are casting it to string basically fooling java by casting
		//so after making container generic<i1, i2> we are not allowed to cast gives exception it should be int type now
		Container<Integer, String> container = new Container<>(12, "hello");//we need to specify data type in <> brackets , otherwise it will be treted as previous rawtype not specific data type
		//Container is  generic class here
		int it1 = container.getItem1();
		System.out.println(it1);
		String it2 = container.getItem2();
		System.out.println(it2);
		
		Container<Double, Integer> container1 = new Container<>(1245.56, 5665);
		double it11 = container1.getItem1();
		System.out.println(it11);
		int it12 = container1.getItem2();
		System.out.println(it12);
		
		Set<String> myset1 = new HashSet<String>();
		myset1.add("first");
		myset1.add("second");
		myset1.add("third");
		myset1.add("four");
		myset1.add("five");
		
		Set<String> myset2 = new HashSet<String>();
		myset2.add("six");
		myset2.add("second");
		myset2.add("seven");
		myset2.add("four");
		myset2.add("computer");
		
		Set<String> resultSet = union(myset1, myset2);
		System.out.println(resultSet);
		
		//iterator over collections
		Iterator<String> itr = resultSet.iterator();//don't use rawtype mention data type
		while(itr.hasNext()) {
			//String var = (String)itr.next();mention type after Iterator so that we can avoid errors at compile time not at runtime
			String var = itr.next();
			System.out.println(var);
		}
	}

//	public static Set union(Set set1, Set set2) {//sets do not store duplicates , it's a nongeneric method now
//		Set result = new HashSet(set1);
//		result.add(set2);
//		return result;
//	}
	
	/*<E> here we are defining what E is just before return type set*/
	//we can use more type parameters like public static <E,K,M,T,Osvs> Set<E> union(Set<E> set1, Set<E> set2) whatever we specify we need to define and use inside the body of the method
	//typically the single lettr is used,E for elements thats in arraylist, T for types 
	//K represents data type of the key. V represents data type of the value these are used in Hashmap
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {//sets do not store duplicates
		//generic method
		//if the union method taking E as data type for argument it better return E data type
//we need to define what E is not one data type like int String double we want it to be generic it should work for any kind of data types
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}


}
