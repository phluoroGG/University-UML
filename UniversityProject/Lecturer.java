import java.util.List;

public class Lecturer extends ResearchPersonal {

    public List<Course> courses;

    public Lecturer(int ssNo, String name, String email, String fieldOfStudy, List<Institute> institutes,
                    List<Participation> participations, List<Course> courses) {
        super(ssNo, name, email, fieldOfStudy, institutes, participations);
        this.courses = courses;
    }


    public void startCourse() {

    }

    public void holdClasses() {

    }

    public void conductExam() {

    }
}