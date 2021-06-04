
public class Human {

	int age;
	String name;
	int height;
	String eyecolor;

	public Human(int age, String name, int height, String eyecolor) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
		this.eyecolor = eyecolor;
	}

	public void speak() {
		System.out.println("Hello my name is " + name);
		System.out.println("I am " + height + " inches tall");
		System.out.println("I am " + age + " years old");
		System.out.println("my eye color is " + eyecolor);
	}

	public void eat() {
		System.out.println("eating....");
	}

	public void walk() {
		System.out.println("walking....");
	}

	public void work() {
		System.out.println("working....");
	}
}
