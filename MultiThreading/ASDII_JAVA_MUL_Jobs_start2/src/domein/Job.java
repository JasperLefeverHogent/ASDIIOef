package domein;

import java.util.concurrent.Callable;

//TODO
public abstract class Job implements Callable<String> {
	
	public abstract String execute();
	
	@Override
	public String call() {
		return execute();
	}
	
}
