import java.util.List;

public class Faculty {

	public String name;
	public Employee dean;
	public List<Institute> institutes;

	public Faculty(String name, Employee dean, List<Institute> institutes) {
		this.name = name;
		this.dean = dean;
		this.institutes = institutes;
	}
}