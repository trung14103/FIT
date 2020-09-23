package courseman1;

public class ElectiveModule extends Module {
    private String department;

    public ElectiveModule(String name, int semester, int credits, String department) {
        super(name, semester, credits);
        this.department = department;
    }

    public ElectiveModule() {
        super();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ElectiveModule{" +
                "department='" + department + '\'' +
                '}';
    }
}
