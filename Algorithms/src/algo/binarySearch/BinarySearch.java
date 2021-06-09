package algo.binarySearch;

public class BinarySearch {

	public static void main(String[] args) {

		System.out.println(binarySearch(new int[] {9,23,45,56,67}, 23));//this algorithm only works for sorted array
	}

//	public static int binarySearch(int[] a, int x) {
//		int p = 0;
//		int r = a.length-1;
//		
//		while(p <= r) {
//			int q = (p+r)/2;
//			if(a[q] < x) p = q+1;
//			else if(a[q] > x) r = q-1;
//			else return q;
//		}
//		
//		return -1;
//	}
	
	public static int binarySearch(int[] a, int x) {//above method and this both are same
		int p = 0;
		int r = a.length-1;
		
		while(p <= r) {
			int q = (p+r)/2;//here we divide array into two halves and see where this element false first half or second half
			if(x < a[q]) r = q-1;
			else if(x > a[q] ) p = q+1;
			else return q;
		}
		
		return -1;
	}
}
