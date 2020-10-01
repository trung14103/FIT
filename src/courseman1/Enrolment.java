package courseman1;

public class Enrolment implements Comparable<Enrolment> {
    private Student student;

    private Module module;

    private double internalMark;

    private double examinationMark;

    private String finalGrade;

    private double aggregatedMark;

    public Enrolment(Student student, Module module, double internalMark, double examinationMark, double finalGrade) {
        this.student = student;
        this.module = module;
        this.internalMark = internalMark;
        this.examinationMark = examinationMark;
        this.aggregatedMark = generateAggregatedMark();
        this.finalGrade = generateFinalGrade();
    }

    public Enrolment(Student student, Module module) {
        this.student = student;
        this.module = module;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public double getInternalMark() {
        return internalMark;
    }

    public void setInternalMark(double internalMark) {
        this.internalMark = internalMark;
    }

    public double getExaminationMark() {
        return examinationMark;
    }

    public void setExaminationMark(double examinationMark) {
        this.examinationMark = examinationMark;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    private double generateAggregatedMark() {
        return this.aggregatedMark = 0.4 * this.internalMark + 0.6 * this.examinationMark;
    }

    private String generateFinalGrade() {
        String finalGradeText = null;
        if (this.aggregatedMark >= 5) {
            finalGradeText = FinalGradeEnum.P.getText();
        } else if (this.aggregatedMark < 5) {
            finalGradeText = FinalGradeEnum.F.getText();
        } else if (this.aggregatedMark >= 7) {
            finalGradeText = FinalGradeEnum.G.getText();
        } else if (this.aggregatedMark > 8.5) {
            finalGradeText = FinalGradeEnum.E.getText();
        }
        return finalGradeText;
    }

    @Override
    public int compareTo(Enrolment otherEnrolment) {
        return this.getStudent().getId().compareTo(otherEnrolment.getStudent().getId());
    }

    @Override
    public String toString() {
        return "Enrolment{" +
                "student=" + student +
                ", module=" + module +
                ", internalMark=" + internalMark +
                ", examinationMark=" + examinationMark +
                ", finalGrade=" + finalGrade +
                ", aggregatedMark=" + aggregatedMark +
                '}';
    }
}
