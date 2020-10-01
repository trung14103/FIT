package courseman1;

public class CourseManProg {
    public static void main(String[] args) {
        Module module1 = new CompulsoryModule("JSD", 1, 1234);
        Module module2 = new CompulsoryModule("MLA", 1, 1235);
        Module module3 = new ElectiveModule("CF", 2, 1236, "FMT");
        Module module4 = new ElectiveModule("Tư tưởng", 2, 1235, "GDCT");
        Module module5 = new CompulsoryModule("PR2", 2, 12348);

        Student student1 = new Student("NgoTrung", "14/10", "QN", "ngotrung99@gmail.com");
        Student student2 = new Student("ThanhTrung", "31/2", "QN", "ngotrung99@gmail.com");
        Student student3 = new Student("HaiDang", "30/2", "HN", "ThanhTrung99@gmail.com");
        Student student4 = new Student("Supernho", "2/9", "HN", "ngotrung99@gmail.com");
        Student student5 = new Student("MinhDuc", "15/6", "NĐ", "ngotrung99@gmail.com");

        EnrolmentManager enrolmentManager = new EnrolmentManager();
        enrolmentManager.addEnrolment(new Enrolment(student1, module1, 7, 8, 0));
        enrolmentManager.addEnrolment(new Enrolment(student3, module3, 6, 5, 0));
        enrolmentManager.addEnrolment(new Enrolment(student1, module2, 6, 4, 0));
        enrolmentManager.addEnrolment(new Enrolment(student1, module2, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student2, module3, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student1, module5, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student5, module5, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student2, module2, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student1, module4, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student4, module2, 0, 0, 0));
        enrolmentManager.addEnrolment(new Enrolment(student5, module5, 0, 0, 0));

        System.out.println(enrolmentManager.report());
        enrolmentManager.sort();
        System.out.println(enrolmentManager.report());

        Enrolment enrolment1 = new Enrolment(student2, module5);
        Enrolment enrolment2 = new Enrolment(student3, module2);
        Enrolment enrolment3 = new Enrolment(student5, module3);
        Enrolment enrolment4 = new Enrolment(student2, module4);
        Enrolment enrolment5 = new Enrolment(student1, module1);

        enrolment1.setExaminationMark(8.6);
        enrolment1.setInternalMark(6);
        enrolment2.setExaminationMark(8);
        enrolment2.setInternalMark(7);
        enrolment3.setExaminationMark(6);
        enrolment3.setInternalMark(6);
        enrolment4.setExaminationMark(4);
        enrolment4.setInternalMark(7);
        enrolment5.setExaminationMark(9);
        enrolment5.setInternalMark(9.6);

        enrolmentManager.addEnrolment(enrolment1);
        enrolmentManager.addEnrolment(enrolment2);
        enrolmentManager.addEnrolment(enrolment3);
        enrolmentManager.addEnrolment(enrolment4);
        enrolmentManager.addEnrolment(enrolment5);

        System.out.println(enrolmentManager.report());

    }
}
