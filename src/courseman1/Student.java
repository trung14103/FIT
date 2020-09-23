package courseman1;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private static Map<Integer, Integer> studentYearMaps = new HashMap<>();

    private String id;

    private String name;

    private String dob;

    private String address;

    private String email;


    public Student(String name, String dob, String address, String email) {
        this.id = generateStudentId();
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.email = email;
    }

    private int getAssignedYear(int year) {
        try {
            int currentStudentCount = studentYearMaps.get(year);
            studentYearMaps.put(year, currentStudentCount++);
            return currentStudentCount;
        } catch (Exception e) {
            studentYearMaps.put(year, 1);
            return 1;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String generateStudentId() {
        int currentYear = LocalDate.now().getYear();
        return "S" + (currentYear + getAssignedYear(currentYear));
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
