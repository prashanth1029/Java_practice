package java_basics;

public class MyUtils {

	public void printFromMyUtils(String sr) {
		System.out.println("from myutils " + sr);
	}

	public static void printFromMyUtils1(String sr) {
		System.out.println("from myutils " + sr);
	}

	public static void sum2Numbers(int arg1, int arg2) {
		System.out.println("sum of two numbers " + arg1 + arg2);
		System.out.println("sum of two numbers " + (arg1 + arg2));
	}

	public static int add10(int a) {
		return a + 10;
	}

	public static String retString(String s) {
		return s + " padded value from retString";
	}
}
