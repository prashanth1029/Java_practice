package client;

public class Container<i1, i2> {//we broke the convention here <i1,i2> the best practice is use single uppercase letter <>

//	String item1;
//	String item2;
	
	i1 item1;
	i2 item2;
	
	public Container(i1 item1, i2 item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public i1 getItem1() {
		return item1;
	}

	public void setItem1(i1 item1) {
		this.item1 = item1;
	}

	public i2 getItem2() {
		return item2;
	}

	public void setItem2(i2 item2) {
		this.item2 = item2;
	}

	public void printItems() {
		System.out.println("printing contents of container: ");
		System.out.println("item1 : " + item1);
		System.out.println("item2 : " + item2);
	}
}
