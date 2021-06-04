package Java_behind_scenes;

public class Test {

	public static void main(String[] args) {// all metods will be stored as frames in stack

		int age = 24;//primitive var local to main, will be in main of stack frame
		
		Car myCar;//loca reference variable wil be in mainframe of stack,complex data type i.e class type that will have the address of the car object
		myCar = new Car();//object of car will be created in heap
		myCar.hp = 1000;//hp will have memory allocated in this car object
		
		myCar = new Car();//the old car object is last as we changed ref from old to new ,we completely last track of that old object, its a rauge its of no use this is where garbaje collector collects that object and clears memory of unused things
		
		Car myCar1 = new Car();
		myCar1.hp = 1500;
		
		Engine bigEngine = new Engine();
		myCar.myEngine = bigEngine;
		
		doWork();//dowork frame will be created in stack
		//	stack mentaince method invocation once method completes exicution that will be erased from the stack or pop of from stack	
	}
	
	public static void doWork() {
		float weight = 1209.98f;//will be in stack of doWork frame
		System.out.println("inside dowork()");
		
		doMore();//domore frame will be created in stack
	}

	public static void doMore() {
		
		System.out.println("inside domore");
	}
}
