package practice.loops;

public class ForLoopPractice {

	public static void main(String[] args) {

		for (int i = 0; i < 100 ; i++) {
			System.out.println("i: " + i);
		}
		
		String str = "erghuhrtuihurthiuhirutyrtmngbdm,fnm,fgm,nfghn";
		for (int i = 0; i < str.length() ; i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println();
		
		for (int i = 0; i <= str.length()-1 ; i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("printing reverse");
		
		/*this is wrong
		 * for (int i = str.length(); i >= 0 ; i--) { System.out.println(str.charAt(i));
		 * }
		 */
		
		for (int i = str.length()-1 ; i >= 0 ; i--) {// because last character of the string will be at length-1 and start will be at 0
			System.out.println(str.charAt(i));
		}
		
		System.out.println("printing even numbers between 0 and 100");
		for (int i = 0; i <= 100 ; i++) {
			if( i%2 == 0)
			System.out.println(i);
		}
		
		System.out.println("printing even numbers between 0 and 100 through increament by 2");
		for (int i = 0; i <= 100 ; i += 2) {
			System.out.println(i);
		}
		
		for (int i = 100; i >= 0 ; i -= 2) {
			System.out.println(i);
		}
	}

}
