package courseman1;


import java.util.ArrayList;
import java.util.Collections;

public class EnrolmentManager {
    protected ArrayList<Enrolment> enrolmentList = new ArrayList<Enrolment>();

    protected void addEnrolment(Enrolment enrolment) {
        if (getEnrolment(enrolment.getStudent(), enrolment.getModule()) != null) {
            System.out.println("Enrolment Already Existed");
        } else {
            enrolmentList.add(enrolment);
            System.out.println("Add Enrolment Successfully");
        }
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
        report_str.append("---------------------REPORT WITH NO ASSESSMENT------------------------------");
        for (Enrolment enrolment : enrolmentList) {
            report_str.append("\n");
            report_str.append(String.format("%10s %15s %20s %18s %15s", "MODULE ID", "MODULE NAME", "MODULE SEMESTER", "STUDENT CODE", "STUDENT NAME", "STUDENT DOB"));
            report_str.append("\n");
            report_str.append(String.format("%8s %14s %16s %22s %16s",
                    enrolment.getModule().getCode(), enrolment.getModule().getName(), enrolment.getModule().getSemester(), enrolment.getStudent().getId(), enrolment.getStudent().getName(), enrolment.getStudent().getDob()));
            report_str.append("\n");
            report_str.append("----------------------------------------------------------------------------------");
            report_str.append("\n");
        }
        return report_str.toString();
    }

    protected String report() {
        StringBuilder report_str = new StringBuilder();
        report_str.append("*------------------------------FULL REPORT-----------------------------------------*");
        for (Enrolment enrolment : enrolmentList) {
            report_str.append("\n");
            report_str.append(String.format("%10s %15s %15s %20s %15s", "MODULE NAME", "STUDENT NAME", "INTERNAL MARK", "EXAMINATION MARK", "FINAL MARK"));
            report_str.append("\n");
            report_str.append(String.format("%8s %18s %10s %15s %20s",
                    enrolment.getModule().getName(), enrolment.getStudent().getName(), enrolment.getInternalMark(), enrolment.getExaminationMark(), enrolment.getFinalGrade()));
            report_str.append("\n");
            report_str.append("----------------------------------------------------------------------------------");
            report_str.append("\n");
        }
        return report_str.toString();
    }

    protected void sort() {
        enrolmentList.sort(Collections.reverseOrder());
    }
}
