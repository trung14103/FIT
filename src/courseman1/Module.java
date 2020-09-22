package courseman1;

public class Module {
    private String code;

    private String name;

    private String semester;

    private int credits;

    public Module(String code, String name, String semester, int credits) {
        this.code = code;
        this.name = name;
        this.semester = semester;
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
