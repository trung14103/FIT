package courseman1;


import java.util.ArrayList;
import java.util.Collections;

public class EnrolmentManager {
    protected ArrayList<Enrolment> enrolmentList = new ArrayList<>();

    protected void addEnrolment(Enrolment enrolment) {
        enrolmentList.add(enrolment);
    }

    protected Enrolment getEnrolment(Student student, Module module) {
        return enrolmentList.stream().filter(e -> ((e.getStudent() == student) & (e.getModule() == module))).findFirst().orElse(null);
    }

    protected void setMarks(Student student, Module module, double internalMark, double examinationMark) {
        Enrolment enrolment = getEnrolment(student, module);
        enrolment.setInternalMark(internalMark);
        enrolment.setExaminationMark(examinationMark);
    }

    protected String reportAssessment() {
        StringBuilder report_str = new StringBuilder();
        for (Enrolment enrolment : enrolmentList) {
            report_str.append(enrolment.toString());
            report_str.append("\n");
        }
        return report_str.toString();
    }

    protected String report() {
        StringBuilder report_str = new StringBuilder();
        for (Enrolment enrolment : enrolmentList) {
            report_str.append(enrolment.getModule().toString()).append(enrolment.getStudent());
            report_str.append("\n");
        }
        return report_str.toString();
    }

    protected void sort() {
        Collections.sort(enrolmentList);
    }
}
