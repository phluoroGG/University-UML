import java.util.Date;
import java.util.List;

public class Project {

	public String name;
	public Date start;
	public Date end;
	public List<Participation> participants;

	public Project(String name, Date start, Date end, List<Participation> participants) {
		this.name = name;
		this.start = start;
		this.end = end;
		this.participants = participants;
	}
}