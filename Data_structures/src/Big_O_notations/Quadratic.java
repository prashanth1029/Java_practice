package Big_O_notations;

public class Quadratic {

	public static void main(String[] args) {
		//this class has only two loops so its called quadratic its scales with size of input notaion bigO(nsquare) bcz it contains two loops
		//if it had 3 loops its called cubic notaion bigO(ncube) bcz it contains three loops		
		int []a = new int[] {1,2,3,4,5};
		int []b = new int[] {1,9,3,4,5};
		System.out.println(countDuplicates(a, b));
		
	}

	public static int countDuplicates(int items1[], int items2[]) {
		int count = 0;
		for (int i = 0; i < items1.length; i++) {
			for (int j = 0; j < items2.length; j++) {
				if(items1[i] == items2[j])
					count++;
			}
		}
		
		return count;
	}
}
