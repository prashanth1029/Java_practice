package practice.strings;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "hello    @$#@&(&%^%";
		System.out.println(a.length());
		
		String str = "ABCDEFG";
		String extractedString = str.substring(1);//reference to index value 1 from there and onwords it will extract the string
		System.out.println(extractedString);
		System.out.println(str.substring(1, 4));// extracts from start index considers start ind character and upto lastindex-1
		System.out.println(str.substring(4, 7));
//		System.out.println(str.substring(4, 8));
		System.out.println(str.substring(0, 7));
		
		String b = "prashi";
		String c = "developer prashi codes prashi code";
		
		if (b == "prashi") {
//			this is the trap don't do this
//			it will work for intiger, characters but not strings bcz Strings are objects that are created in heap
		}
		
		if (!b.equals("prashi")) {//not b dot equals
//			use this
		}
		
		if (c.equals("developer")) {
			System.out.println("printed developer");
		}
		
		if (b.equalsIgnoreCase("PRashi")) {
			System.out.println("printed from equalsIgnoreCase: " + b);
		}
		
		System.out.println(a.charAt(4));//has to be a single character
		
		System.out.println("index " + c.indexOf("prashi"));//it will search from left to right and numbering also same
		System.out.println(c.indexOf("prashi",4));
		System.out.println(c.indexOf("prashi",10));
		int q = str.indexOf("as");
		System.out.println(q);// returns -1 if didn't find the passsed string arg in the actual string
		int r = c.indexOf("prashi",10);
		System.out.println(c);
		System.out.println(c.indexOf("prashi",12));
		System.out.println(c.lastIndexOf("prashi"));//it will search from last but the index numbering from left to right
		
		
	}

}
