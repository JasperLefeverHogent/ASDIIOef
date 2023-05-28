package domein;

import javafx.beans.value.ChangeListener;

public class DomeinController {

	private TellerThread tellerThread;
	private Thread thread;
	/*
	 * public DomeinController() { tellerThread = new TellerThread(); new
	 * Thread(tellerThread).start(); }
	 */

	public DomeinController() {
		init();
	}

	private void init() {
		tellerThread = new TellerThread();
		thread = new Thread(tellerThread);
		thread.start();
	}

	public void addObserver(ChangeListener<? super Number> listener) {
		tellerThread.addObserver(listener);
	}

	public void resume() {
		tellerThread.resume();
	}

	public void suspend() {
		tellerThread.suspend();
	}

	public void stop() {
		tellerThread.stop();
	}

	public void restart() {
		tellerThread.stop();
		while(thread.isAlive()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		init();
	}
}
