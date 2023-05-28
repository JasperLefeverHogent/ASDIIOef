package domein;

import java.security.SecureRandom;

public class Kelner implements Runnable {

	private static final SecureRandom sr = new SecureRandom();
	private String naam;
	private Restaurant restaurant;

	public Kelner(Restaurant restaurant, String naam) {
		this.naam = naam;
		this.restaurant = restaurant;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(sr.nextInt(2000));
				Order order = restaurant.haalOrderOp();
				System.out.printf("Kelner %s krijgt %s%n", naam , order);
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
		

	}


}
