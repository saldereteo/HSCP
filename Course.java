package suncoastChapter4;

public class Course {
	private static final int MAX_STUDENTS = 20;
	private Student[] students = new Student[MAX_STUDENTS];
	private String instructor;
	private String courseName;
	private String courseId;
	private int studentCount = 0;
	
	public Course(String instructor, String courseName, String courseId) {
		this.instructor = instructor;
		this.courseName = courseName;
		this.courseId = courseId;
	}
	
	public String getInstructor() {
		return instructor;
	}
	
	public String getCourseName () {
		return courseName;
	}
	
	public String getCourseId() {
		return courseId;
	}
	
	public void addStudent(Student student) {
		if (studentCount < MAX_STUDENTS) {
			students[studentCount] = student;
			studentCount++;
		} else {
			System.out.println("Too many students!!!!");
		}
	}
	

}
