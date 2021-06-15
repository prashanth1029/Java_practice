package producerconsumer;

import java.util.List;

public class Producer implements Runnable {

	List<Integer> questionList = null;
	final int LIMIT = 5;
	private int questionNo;

	public Producer(List<Integer> questionList) {
		super();
		this.questionList = questionList;
	}

	public void readQuestion(int questionNO) throws InterruptedException {
		synchronized (questionList) {
			while (questionList.size() == LIMIT) {
				System.out.println("Question have piled up.. wait for answers");
				questionList.wait();// wait and notify and notifyAll can only be called in a synchronized block
			}
		}

		synchronized (questionList) {
			System.out.println("New Question: " + questionNo);
			questionList.add(questionNo);
			Thread.sleep(100);
			questionList.notify();
			// questionList.notifyAll();// notifies all threads that are waiting
		}
	}

	@Override
	public void run() {

		while (true) {
			try {
				readQuestion(questionNo++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
