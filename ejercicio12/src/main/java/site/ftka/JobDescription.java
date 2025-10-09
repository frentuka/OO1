package site.ftka;

public class JobDescription {
	private double effort;
	private int priority;
	private String description;

	public JobDescription(double effort, int priority, String description) {
		this.effort = effort;
		this.priority = priority;
		this.description = description;
	}

	public double getEffort() {
		return effort;
	}

	public int getPriority() {
		return priority;
	}

	public String getDescription() {
		return description;
	}

	public void setEffort(double effort) {
		this.effort = effort;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}