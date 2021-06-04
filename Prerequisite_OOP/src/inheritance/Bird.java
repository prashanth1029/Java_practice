package inheritance;
public class Bird extends Animal{

	public Bird(String aniName, String color, int height, int lifeSpan) {
		super(aniName, color, height, lifeSpan);
	}

	public void fly() {
		System.out.println("flying....");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("flapping wings..");
	}
	
	
}
