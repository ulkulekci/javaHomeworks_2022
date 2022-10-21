package entities;

public class Course {
	private int courseId;
    private String courseName;
    private String instructorName;
    private int unitPrice;
	public Course() {
		
	}
	public Course(int courseId, String courseName, String instructorName, int unitPrice) {
	
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.unitPrice = unitPrice;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}   
}
