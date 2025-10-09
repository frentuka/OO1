package site.ftka;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {

	private List<JobDescription> queue = new ArrayList<>();

	public void schedule(JobDescription job) {
		this.queue.add(job);
	}

	public void unschedule(JobDescription job) {
		this.queue.remove(job);
	}

	public JobDescription next() {
		if (!queue.isEmpty())
			return queue.stream().findFirst().get();
		else
			return null;
	}

}
