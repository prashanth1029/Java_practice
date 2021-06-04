package Big_O_notations;

public class Constant {

	public static void main(String[] args) {
		// this class don't even have one loop so its called constant just returns the element from the array notation bigO(1)
		int []a = new int[] {1,2,3,4,5};
		System.out.println(getElementFrom(a, 2));
	}
	
	public static int getElementFrom(int elements[], int index) {
		return elements[index];
	}


}
