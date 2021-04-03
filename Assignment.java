
public class Assignment {
	
	String name;
	String course;
	long dueDate;
	int points;
	boolean completed;
	
	
	public Assignment(String name, String course, long dueDate, int points, boolean completed) {
		this.name = name;
		this.course = course;
		this.dueDate = dueDate;
		this.points = points;
		this.completed = completed;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public long getDueDate() {
		return dueDate;
	}
	
	public int getPoints() {
		return points;
	}
	
	public boolean getCompleted() {
		return completed;
	}
	
	
	public String toString() {
		String output = name + " from the class " + course + " is worth " + points + " and due on " + dueDate + ".";
		if(completed == true) output += " The assignment has been completed.";
		else output+= " The assignment has not been completed.";
		return output;
	}
	
	
}
