package practice.loops;

public class WhileLoopPractice {

	public static void main(String[] args) {

		/*
		 * while(true) { System.out.println("parshanth"); }
		 */
		
		int count = 0;
		
		/*
		 * while(count <= 100) { System.out.println("bisaralli"); }
		 */
		
		while(count <= 100) {
			
			System.out.println("prashanth: " + count);
			count = count + 1;
			
			if(count == 5)
			break;
		}
		
		count = 0;
		
		while(!(count <= 100)) {
			System.out.println("nothing prints here bcz it's never evaluates to  true " + count);
			count = count + 1;
		}
		
		String str = "We have a large inventory of things in our warehouse falling in "
				+ "the category:apperal and slightly "
				+ "more in demand category:makeup along with the category:furniture and ";
		
		printCateogries(str);
		
	}
	
	public static void printCateogries(String str) {
		
		int i =0;
		while (true) {
			int found = str.indexOf("category:", i);
			if (found == -1) break;
			int start = found + 9;// start of the actual category
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			i = end+1;

		}
	}

}
