import java.util.List;

public class ResearchPersonal extends Employee {

	public String fieldOfStudy;
	public List<Institute> institutes;
	public List<Participation> participations;

	public ResearchPersonal(int ssNo, String name, String email, String fieldOfStudy, List<Institute> institutes,
							List<Participation> participations) {
		super(ssNo, name, email);
		this.fieldOfStudy = fieldOfStudy;
		this.institutes = institutes;
		this.participations = participations;
	}

	public void joinProject() {

	}

	public void workWithProject() {

	}

	public void becomeLecturer() {

	}
}