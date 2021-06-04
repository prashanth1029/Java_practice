package inheritance;
public class Fish extends Animal{

	public Fish(String aniName, String color, int height, int lifeSpan) {
		super(aniName, color, height, lifeSpan);
	}

	public void swim() {
		System.out.println("Swimming....");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("fish is swimming");
	}
}
