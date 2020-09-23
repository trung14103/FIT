package courseman1;

public class Enrolment implements Comparable<Enrolment> {
    private Student student;

    private Module module;

    private double internalMark;

    private double examinationMark;

    private double finalGrade;

    private double aggregatedMark;

    public Enrolment(Student student, Module module, double internalMark, double examinationMark, double finalGrade) {
        this.student = student;
        this.module = module;
        this.internalMark = internalMark;
        this.examinationMark = examinationMark;
        this.finalGrade = finalGrade;
        this.aggregatedMark = generateAggregatedMark();
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

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public double generateAggregatedMark() {
        return this.aggregatedMark = 0.4 * this.internalMark + 0.6 * this.examinationMark;
    }

    @Override
    public int compareTo(Enrolment enrolment) {
        return 0;
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
