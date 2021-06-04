package practice.loops;

import java.util.Iterator;

public class NestedForLoopsandDebugger {

	public static void main(String[] args) {

		int counter = 0;
		//when you program stay away from the nested loops, at max use only two loops one outer and one inner loop
		//often times it will be easier to understand loops start from inner loop, see from inner loop to outer loop
		//these loop will run 100*100*100*100
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				for (int j2 = 0; j2 < 100; j2++) {
					for (int k = 0; k < 100; k++) {
						System.out.println("the value of i was "+ i + "----" + j + "----" + j2 + "----" + k);
						counter = counter + 1;	
					}
				}
			}
		}
		System.out.println(counter);
	}

}
