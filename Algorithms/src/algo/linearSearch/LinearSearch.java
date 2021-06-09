package algo.linearSearch;

public class LinearSearch {

	public static void main(String[] args) {

		System.out.println(linearSearch(new int[] {90,23,45,56,67}, 123));
	}
	
//	public static int linearSearch(int []a, int x) {
//		int ans = -1;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] == x) {
//				ans = x;it's a bad approach here no where we are breaking even at start if we found the element we are traversing through whole array elemets
//			}
//		}
//		return ans;
//	}

	public static int linearSearch(int []a, int x) {//its O(n) big o notation algorithm
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;//as soon as we found element we are returning its a better approach bcz after finding element index we won't traverse through full array
			}
		}
		return -1;
	}

}
