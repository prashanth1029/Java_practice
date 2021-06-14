package com.prashi.learnigThreading;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("starting thread1");
		//Task task = new Task("Thread-a");
	//	task.start(); we can use this only if we extend from thread class
		//task.run();// it's compiling but it's not multi threaded anymore
		
		//we can do that by implementing runnable like below
		Thread t1 = new Thread(new Task("Thread-a"));
		t1.start();
		
		System.out.println("hello there....");
		
		//task.start();//it's never leagal to start the thread again
		
		//we can do like below with seperate new thread
		System.out.println("starting thread2");
		Task task1 = new Task("Thread-b");
		//task1.start();we can use this only if we extend from thread class
		//task1.run();// it's compiling but it's not multi threaded anymore
		Thread t2 = new Thread(task1);
		t2.start();
		
		//creating thread with anonymous class
		System.out.println("starting thread 3");
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub

				for(int i=0; i < 15; i++) {
					System.out.println("number: " + i + " - " + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t3.start();
	}
}

//class Task extends Thread {
	
class Task implements Runnable {
	
	String name;
	
	public Task(String string) {
		this.name = string;
	}

	public void run() { 
		Thread.currentThread().setName(this.name);
		for(int i=0; i < 15; i++) {
			System.out.println("number: " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}