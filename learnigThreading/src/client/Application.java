package client;

import java.util.Vector;

import threadsafetycollections.InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {

		InventoryManager manager = new InventoryManager();
		
		Vector vector = new Vector();
		
		Thread inventoryTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.populateSoldProducts();
			}
		});
		
		Thread displayTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.displaySoldProducts();
			}
		});
		
		inventoryTask.start();
		Thread.sleep(1000);// we will get concurrentModificationException 
		//inventoryTask.join();//if we use this the program becomes not multi threaded anymore
		//to solve this we need to use copyonwritecollections
		displayTask.start();
	}

}
