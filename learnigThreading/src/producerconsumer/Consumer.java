package producerconsumer;

import java.util.List;

public class Consumer implements Runnable {

	List<Integer> questionList = null;

	public Consumer(List<Integer> questionList) {
		super();
		this.questionList = questionList;
	}

	public void answerQuestion() throws InterruptedException {
		synchronized (questionList) {
			while (questionList.isEmpty()) {
				System.out.println("No Question to answer.. Waiting for producer");
				questionList.wait();// wait and notify and notifyAll can only be called in a synchronized block
			}
		}

		synchronized (questionList) {
			Thread.sleep(5000);
			System.out.println("Answered Question: " + questionList.remove(0));
			questionList.notify();
			// questionList.notifyAll();// notifies all threads that are waiting
		}
	}

	@Override
	public void run() {

		while (true) {
			try {
				answerQuestion();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
