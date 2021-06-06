package lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {

		HashMap<String, String> dictionary = new HashMap<String, String>();//not maintains insertion order, its random not in order
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "exceptionaly clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary.put("Confidence", "the state of feeling certain about the truth of something.");
		
		System.out.println("printing from HashMap");
		for (String string : dictionary.keySet()) {
			System.out.println(string);
		}
		
		LinkedHashMap<String, String> linkDictionary = new LinkedHashMap<String, String>();//maintains insertion order
		linkDictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		linkDictionary.put("Brilliant", "exceptionaly clever or talented.");
		linkDictionary.put("Joy", "a feeling of great pleasure and happiness.");
		linkDictionary.put("Confidence", "the state of feeling certain about the truth of something.");
		
		System.out.println("printing from LinkedHashMap");
		for (String string1 : linkDictionary.keySet()) {
			System.out.println(string1 + ": " + linkDictionary.get(string1));
		}
		
		//loop over both key,val together
		for(Map.Entry<String, String> entry: linkDictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		TreeMap<String, String> treeDictionary = new TreeMap<String, String>();
		//sort the keys in there natural order that is alphabetical order for strings
		treeDictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		treeDictionary.put("Brilliant", "exceptionaly clever or talented.");
		treeDictionary.put("Joy", "a feeling of great pleasure and happiness.");
		treeDictionary.put("Confidence", "the state of feeling certain about the truth of something.");
		treeDictionary.put("Brilliant", "fffffffffffffff.");
		//thing is hashmap ,linkedhashmap, treemap can not be used to store duplicates or unique, it will override the value with new value 
		System.out.println("printing from TreeMap");
		for (String string : treeDictionary.values()) {
			System.out.println(string);
			
			//loop over both key,val together
			System.out.println("printing from map with both keys and values");
			for(Map.Entry<String, String> entry: treeDictionary.entrySet()) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
		}
	}

}
