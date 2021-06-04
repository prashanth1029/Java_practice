package com.yaman.learnigfilereader;

class MyClass implements AutoCloseable{

	@Override
	public void close() throws Exception {

		System.out.println("closing");
	}
	
}

public class Application3 {

	public static void main(String[] args) {

		try(MyClass var = new MyClass();){
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
