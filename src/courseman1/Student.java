package courseman1;


import java.time.LocalDate;

public class Student {
    private static int studentAmount  = 0;

    private String id;

    private String name;

    private String dob;

    private String address;

    private String email;


    public Student(String name, String dob, String address, String email) {
        studentAmount++;
        this.id = generateStudentId();
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.email = email;
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
        return "S" + (currentYear + studentAmount);
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
