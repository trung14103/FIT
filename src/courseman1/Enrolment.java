package courseman1;

public class Enrolment implements Comparable<Enrolment> {
    private Student student;

    private Module module;

    private float internalMark;

    private float examinationMark;

    private float finalGrade;

    public Enrolment(Student student, Module module, float internalMark, float examinationMark, float finalGrade) {
        this.student = student;
        this.module = module;
        this.internalMark = internalMark;
        this.examinationMark = examinationMark;
        this.finalGrade = finalGrade;
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

    public float getInternalMark() {
        return internalMark;
    }

    public void setInternalMark(float internalMark) {
        this.internalMark = internalMark;
    }

    public float getExaminationMark() {
        return examinationMark;
    }

    public void setExaminationMark(float examinationMark) {
        this.examinationMark = examinationMark;
    }

    public float getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(float finalGrade) {
        this.finalGrade = finalGrade;
    }

    @Override
    public int compareTo(Enrolment enrolment) {
        return this.student.getId() - enrolment.student.getId();
    }
}
