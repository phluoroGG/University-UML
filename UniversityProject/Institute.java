import java.util.List;

public class Institute {

	public String name;
	public String address;
	public Faculty faculty;
	public List<ResearchPersonal> researchPersonal;

	public Institute(String name, String address, Faculty faculty, List<ResearchPersonal> researchPersonal) {
		this.name = name;
		this.address = address;
		this.faculty = faculty;
		this.researchPersonal = researchPersonal;
	}
}