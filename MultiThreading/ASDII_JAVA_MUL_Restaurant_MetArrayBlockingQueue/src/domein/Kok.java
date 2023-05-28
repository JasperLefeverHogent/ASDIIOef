package domein;

import java.security.SecureRandom;

public class Kok implements Runnable {

	private static final SecureRandom sr = new SecureRandom();
	private Restaurant restaurant;
	
	public Kok(Restaurant restaurant) {
		this.restaurant = restaurant;
	
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(sr.nextInt(2000));
				restaurant.plaatsOrder(new Order());
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
	}

}
