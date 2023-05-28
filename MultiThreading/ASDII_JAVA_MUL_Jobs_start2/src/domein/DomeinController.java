package domein;

import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DomeinController {

	private GatherResult<String> gatherResult = new GatherResult<>();

	public void runJobs() {
		List<Job> jobs = List.of(new JobA(), new JobB(), new JobC());

		ExecutorService application = Executors.newFixedThreadPool(jobs.size() * 2);
		List<Future<String>> futureList = jobs.stream().map(application::submit).collect(Collectors.toList());
		


		/*futureList.stream().forEach(future -> {
			try {
				gatherResult.addResult(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		});*/
		
		futureList.forEach(f -> application.execute(new ReportJob<>(f, gatherResult)));
		
		application.shutdown();
	}

	public void addObserver(PropertyChangeListener pcl) {
		gatherResult.addObserver(pcl);
	}
}
