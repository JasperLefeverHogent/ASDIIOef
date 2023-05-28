package domein;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Restaurant {
	
	
	private Lock accessLock = new ReentrantLock();
	private Condition kanPlaatsen = accessLock.newCondition();
	private Condition kanOphalen = accessLock.newCondition();
	private Order order;
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Order haalOrderOp() {
		accessLock.lock();
		Order ref = null;
		try {
			while (this.order == null) {
				kanOphalen.await();
			}
			ref = this.order;
			this.order = null;
			
			
			kanPlaatsen.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}finally {
			accessLock.unlock();
		}
		return ref;
	}

	public void plaatsOrder(Order order) {
		accessLock.lock();
		try {
			while (this.order != null) {
				kanPlaatsen.await();
			}
			
			this.order = order;
	
			
			kanOphalen.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}finally {
			accessLock.unlock();
		}	
	}


}
