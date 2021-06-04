package java_basics;

import someotherpackage.ExampleClass;

public class LearningMethods {

	public static void main(String[] args) {

		System.out.println("from main");
		printSomeJunk();
		printSomeJunkWithParam("from printSomeJunkWithParam");
		printNumber(16);

		MyUtils obj = new MyUtils();
		obj.printFromMyUtils("hey myutils");

		MyUtils.printFromMyUtils1("hey with param");
		MyUtils.sum2Numbers(12, 30);

		System.out.println("10 added value " + MyUtils.add10(12));
		String tsr = MyUtils.retString("argument") + " padding from main";
		System.out.println(tsr);

		ExampleClass.doSomething();

	}

	public static void printSomeJunk() {
		System.out.println("from printsomejunk");
	}

	public static void printSomeJunkWithParam(String str) {
		System.out.println(str + " some other thing");
	}

	public static void printNumber(int num) {
		System.out.println("Integer passed in " + num);
	}
}
