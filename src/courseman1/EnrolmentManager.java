package courseman1;


import java.util.ArrayList;

public class EnrolmentManager {
    protected ArrayList<Enrolment> enrolmentList;
    protected ArrayList<Student> studentList;
    protected ArrayList<Module> moduleList;

    public void addEnrolment(Enrolment enrolment) {
        enrolmentList.add(enrolment);
    }

    public Enrolment getEnrolment(Student student, Module module) {
        return (Enrolment) enrolmentList.stream().filter(e -> ((e.getStudent() == student) & (e.getModule() == module)));
    }

    public void setMarks(Student student, Module module, double internalMark, double examinationMark) {

    }
}
