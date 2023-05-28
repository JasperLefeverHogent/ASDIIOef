package domain;

public class SomeThread extends Thread {
	public SomeThread() {
		this(false);
	}
	public SomeThread(boolean interrupt) {
		if (interrupt) {
			interrupt();
		}
	}
	
	@Override
	public void run() {
		System.out.printf("%s I am running and interrupted status is %s%n", getName(), isInterrupted());	
		try {
			System.out.printf ("%s I'll sleeping for 10 seconds...%n", getName());
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.printf("%s Someone woke me up, my interrupted status is reset %s%n", getName(), isInterrupted());
		}
		System.out.printf("%s Woa, I feel well rested, I'll stop working now and interrupted status is %s%n", getName(), isInterrupted());
	}
}
