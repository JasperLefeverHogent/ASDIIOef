package domein;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Restaurant {
	
	
	/*private Lock accessLock = new ReentrantLock();
	private Condition kanPlaatsen = accessLock.newCondition();
	private Condition kanOphalen = accessLock.newCondition();
	private Order order;*/
	private ArrayBlockingQueue<Order> order;
	
	public Restaurant() {
		this.order = new ArrayBlockingQueue<>(1);
	}

	public Order haalOrderOp() {
		//accessLock.lock();
		Order ref = null;
		try {
			/*while (this.order == null) {
				kanOphalen.await();
			}
			ref = this.order;
			this.order = null;
			
			
			kanPlaatsen.signal();*/
			ref = order.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}finally {
			//accessLock.unlock();
		}
		return ref;
	}

	public void plaatsOrder(Order o) {
		//accessLock.lock();
		try {
			/*while (this.order != null) {
				kanPlaatsen.await();
			}
			
			this.order = order;
	
			
			kanOphalen.signal();*/
			this.order.put(o);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}finally {
			//accessLock.unlock();
		}	
	}


}
