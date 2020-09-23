package courseman1;

import java.util.HashMap;
import java.util.Map;

public class Module {
    private final static int moduleNum = 100;

    private static Map<Integer, Integer> semesterMap = new HashMap<>();

    private String code;

    private String name;

    private int semester;

    private int credits;

    public Module(String name, int semester, int credits) {
        this.semester = semester;
        this.code = generateModuleCode(semester);
        this.name = name;
        this.credits = credits;
    }


    private int getSemesterCount(int semester) {
        try {
            int semesterModule = semesterMap.get(semester);
            semesterModule++;
            semesterMap.put(semester, semesterModule);
            return semesterModule;
        } catch (Exception e) {
            semesterMap.put(semester, 1);
            return 1;
        }
    }

    public Module() {

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

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String generateModuleCode(int semester) {
        return "M" + (moduleNum * this.semester + getSemesterCount(semester));
    }

    @Override
    public String toString() {
        return "Module{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", semester=" + semester +
                ", credits=" + credits +
                '}';
    }
}
