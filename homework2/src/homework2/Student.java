package homework2;

public class Student extends User {
	
	private String[] completedCourses;
	private String completedPercentage;
	private String[] enteredCourses;
	
	public String[] getCompletedCourses() {
		return completedCourses;
	}
	
	public void setCompletedCourses(String[] completedCourses) {
		this.completedCourses = completedCourses;
	}
	
	public String getCompletedPercentage() {
		return completedPercentage;
	}
	
	public void setCompletedPercentage(String completedPercentage) {
		this.completedPercentage = completedPercentage;
	}
	
	public String[] getEnteredCourses() {
		return enteredCourses;
	}
	
	public void setEnteredCourses(String[] enteredCourses) {
		this.enteredCourses = enteredCourses;
	}
}
