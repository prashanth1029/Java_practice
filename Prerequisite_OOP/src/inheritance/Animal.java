package inheritance;

public abstract class Animal {

	String aniName;
	String color;
	int height;
	int lifeSpan;
	
	public Animal(String aniName, String color, int height, int lifeSpan) {
		super();
		this.aniName = aniName;
		this.color = color;
		this.height = height;
		this.lifeSpan = lifeSpan;
	}

	public void speak() {
		System.out.println("Hello my name is " + aniName);
		System.out.println("I am " + height + " inches tall");
		System.out.println("my life span is " + lifeSpan + " years");
		System.out.println("my eye color is " + color);
	}
	
	public void eat() {
		System.out.println("eating....");
	}
	
	public void sleep() {
		System.out.println("eating....");
	}
	
	public abstract void move();
}

