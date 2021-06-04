import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

//		for (int i = 0; i < 3; i++) {
//			
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter some text: ");
//		String enteredText = input.nextLine();
//		System.out.println(enteredText);
//		
//		}

		try {
			File file = new File("myFile.txt");
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String temp = input.nextLine();
				System.out.println(temp);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("file with that name not there");
			//e.printStackTrace();
		}
		
		MyFileUtils uti = new MyFileUtils();
		try {
			System.out.println(uti.substract10FromLargerNumber(9));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
