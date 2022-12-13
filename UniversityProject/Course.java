import java.util.List;

public class Course {

	public int id;
	public String name;
	public int hours;
	public List<Lecturer> lecturers;

	public Course(int id, String name, int hours, List<Lecturer> lecturers) {
		this.id = id;
		this.name = name;
		this.hours = hours;
		this.lecturers = lecturers;
	}
}