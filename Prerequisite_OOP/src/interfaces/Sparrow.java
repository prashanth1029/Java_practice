package interfaces;

public class Sparrow extends Biird implements Flyable,Eatable{

	public Sparrow(String aniName, String color, int height, int lifeSpan) {
		super(aniName, color, height, lifeSpan);

	}
//a class can inherit only one class, but can extends multiple interfaces
	
	public void fly() {
		System.out.println("sparrow flying high");
	}

	public void eat() {
		System.out.println("sparrow eating at its phase");
	}

}
