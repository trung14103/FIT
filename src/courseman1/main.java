package courseman1;

public class main {
    public static void main(String[] args) {
        Module module1 = new CompulsoryModule("JSD", 1, 1234);
        Module module2 = new CompulsoryModule("MLA", 1, 1235);
        Module module3 = new ElectiveModule("CF", 2, 1236, "FMT");
        Module module4 = new ElectiveModule("Tư tưởng", 2, 1235, "GDCT");
        Module module5 = new CompulsoryModule("PR2", 2, 12348);

        Student student1 = new Student("NgoTrung", "14/10", "QN", "ngotrung99@gmail.com");
        Student student2 = new Student("ThanhTrung", "deobiet", "QN", "ngotrung99@gmail.com");
        Student student3 = new Student("HaiDang", "deobiet", "HN", "ThanhTrung99@gmail.com");
        Student student4 = new Student("Supernho", "deobiet", "HN", "ngotrung99@gmail.com");
        Student student5 = new Student("MinhDuc", "deobiet", "NĐ", "ngotrung99@gmail.com");

        EnrolmentManager enrolmentManager = new EnrolmentManager();
        enrolmentManager.addEnrolment(new Enrolment(student1, module1, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student3, module3, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student1, module2, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student1, module2, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student2, module3, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student1, module5, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student5, module5, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student2, module2, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student1, module4, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student4, module2, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student5, module5, 0, 0, 0));

        System.out.println(enrolmentManager.reportAssessment());
    }
}
