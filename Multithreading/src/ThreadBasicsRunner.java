//extends Thread
//implements Runnable

class Task1 extends Thread {
	public void run() { // SIGNATURE

		// Task1
		System.out.print("\nTask1 Started");

		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		Thread.yield();

		System.out.print("\nTask1 Done");

	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		// Task2
		System.out.print("\nTask2 Started");

		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask2 Done");

	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {

//		NEW - When a task/thread is ready, but nobody has told it to start running yet;
//		RUNNABLE - When a thread is ready to run, but another thread is being executed;
//		RUNNING - When an task/thread is being executed;
//		BLOCKED/WAITING - When a thread is waiting for a external service to respond.
//						When a database is too slow. When a thread is waiting in info from another thread;
//		TERMINATED/DEAD - When an execution is complete ;

//		Task1 - 101 to 199
		System.out.print("\nTask1 Kicked Off");

		Task1 task1 = new Task1();
		task1.setPriority(1); // Just a request, not 100% guaranteed.
		task1.start(); // task1.run();

		System.out.print("\nTask2 Kicked Off");

//		Task2 - 201 to 299
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

//		for (int i = 201; i <= 299; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.print("\nTask2 Done");

		task1.join();
		task2Thread.join();

		System.out.print("\nTask3 Kicked Off");

		// Wait for task1 to complete

//		Task3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask3 Done");

		System.out.print("\nMain Done");


	}

}
