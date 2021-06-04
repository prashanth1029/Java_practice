package Abstract_data_type;

public class App {

	public static void main(String[] args) {

		Counter cnt = new Counter("myCounter");
		
		cnt.increment();
		cnt.increment();
		cnt.increment();
		cnt.increment();
		int a = cnt.getCurrentValue();
		System.out.println(a);
		cnt.toString();
	}

}
