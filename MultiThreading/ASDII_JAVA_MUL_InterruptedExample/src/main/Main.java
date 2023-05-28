package main;

import java.util.List;

import domain.SomeThread;

public class Main {

	public static void main(String[] args) {
		Thread one = new SomeThread();
		Thread two = new SomeThread();
		Thread three = new SomeThread(true);
		List.of(one, two, three).forEach(Thread::start);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		one.interrupt();	
	}
}