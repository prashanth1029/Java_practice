package inheritance;
public class Zoo {

	public static void main(String[] args) {
		
		/*
		 * Animal ani1 = new Animal("palmorian dog", "black", 12, 18); Animal ani2 = new
		 * Animal("lion", "orrange", 15, 20);
		 * we are not allowed to create objects for abstract class i.e we can never create instance for a abstract class
		 * ani1.speak(); ani2.speak();
		 */
        
        Animal brd1 = new Bird("parrot", "green", 12, 2);
//        brd1.speak();
//        brd1.move();
        
        Animal fsh1 = new Fish("parake meen", "light black", 10, 4);
//        fsh1.speak();
//        fsh1.move();
        
        moveAnimals(fsh1);
        moveAnimals(brd1);
	}

	public static void moveAnimals(Animal animal) {
		animal.move();
	}
}
