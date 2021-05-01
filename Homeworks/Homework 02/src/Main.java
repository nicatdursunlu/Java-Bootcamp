import managers.InstructorManager;
import managers.StudentManager;
import models.Instructor;
import models.Student;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1);
        student.setFirstName("Nijat");
        student.setLastName("Dursunlu");
        student.setEmail("nicat.dursunlu@gmail.com");
        student.setStudentNumber("124660564");
        student.setCompletingPercentage(55);

        Instructor instructor = new Instructor();
        instructor.setId(2);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setEmail("engin.demirog@gmail.com");
        instructor.setBiography("Yazılım geliştirmeye lisede \"yazılım\" bölümünde okurken başladım.\n" +
                "\n" +
                "Üniversite hayatıma ÖSS 2003 Türkiye derecesiyle başladım. Sırasıyla Başkent ve ODTÜ'de Yönetim Bilişim Sistemleri (Lisans-Burslu) ve Tıp Bilişimi(Yüksek Lisans) okudum.");

//        UserManager userManager = new UserManager();
//        userManager.add(student);
//        userManager.register(instructor);
//        userManager.update(student);
//        userManager.remove(instructor);
//
//        UserManager userManager1 = new InstructorManager();
//        userManager1.add(instructor);
//        userManager1.update(student);
//        userManager1.register(instructor);
//        userManager1.remove(student);
//
//        UserManager userManager2 = new StudentManager();
//        userManager2.add(student);
//        userManager2.update(instructor);
//        userManager2.remove(student);
//        userManager2.register(student);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        studentManager.register(student);
        studentManager.update(student);
        studentManager.remove(student);
        studentManager.addComment("This course for beginners");

        String[] courses = {"Java + React Bootcamp", "C# + Angular"};
        studentManager.addCourses(courses);


        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.register(instructor);
        instructorManager.update(instructor);
        instructorManager.remove(instructor);
    }
}
