package ds.stack.reverseString;

public class App1 {

	public static void main(String[] args) {
		
		/*
		 * Stack1 sck = new Stack1(5); sck.push('h'); sck.push('e'); sck.push('l');
		 * sck.push('l'); sck.push('o');
		 * 
		 * while (!sck.isEmpty()) { char c = sck.pop(); System.out.println(c);
		 *
		}*/
		
		System.out.println(reverseString("hello"));
		System.out.println(reverseString("prashi"));
	}
	
	public static String reverseString(String str) {
		int stackSize = str.length();// get the max size of the stack
		Stack1 sck = new Stack1(stackSize);//we make the stack
		for (int i = 0; i < stackSize; i++) {
			  char ch = str.charAt(i);
			  sck.push(ch);
		}
		
		String result = "";
		while(!sck.isEmpty()) {
			char ch = sck.pop();
			result += ch;
		}
		return result;
	}
}
