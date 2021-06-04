package Big_O_notations;

public class Linear {

	public static void main(String[] args) {
		//this class has only one loop so its called linear its scales with size of input notaion bigO(n)
		int []a = new int[] {1,2,3,4,5};
		System.out.println(countEvens(a));
	}
	
	public static int countEvens(int elements[]) {
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			if(elements[i]%2 == 0)
				count++;
		}
		return count;
	}

}
