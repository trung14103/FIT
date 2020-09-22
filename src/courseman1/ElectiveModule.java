package courseman1;

public class ElectiveModule extends Module {
    private String department;

    public ElectiveModule(String code, String name, String semester, int credits, String department) {
        super(code, name, semester, credits);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
