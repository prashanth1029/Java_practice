package interfaces;

public class Test1 {

	public static void main(String[] args) {

		/*
		 * Chicken chk1 = new Chicken("hen", "black", 12, 20); //chk1.fly();
		 * 
		 * Sparrow sp1= new Sparrow("gubbi", "red", 10, 20); sp1.fly(); sp1.eat();
		 */
		
		Flyable flybrd = new Sparrow("sparrrro1", "black", 10, 20);
		flybrd.fly();
	}

}
