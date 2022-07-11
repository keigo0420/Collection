package practice;

import java.time.*;

public class Task implements Comparable<Task> {

	private LocalDate date;
	private String task;

	public Task(LocalDate date, String task) {
		this.date = date;
		this.task = task;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getTask() {
		return task;
	}

	public int compareTo(Task t) {
		return this.date.compareTo(t.date);
	}

	public String toString() {
		return this.date + " " + this.task;
	}

}
