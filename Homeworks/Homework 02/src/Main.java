import models.Instructor;
import models.Student;
import models.User;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1);
        student.setFirstName("Nijat");
        student.setLastName("Dursunlu");
        student.setEmail("nicat.dursunlu@gmail.com");
        student.setStudentNumber("124660564");
        student.setCompletingPercentage(55);
//        student.setCourses("Java + React Bootcamp");

        Instructor instructor = new Instructor();
        instructor.setId(2);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setEmail("engin.demirog@gmail.com");
        instructor.setBiography("Yazılım geliştirmeye lisede \"yazılım\" bölümünde okurken başladım.\n" +
                "\n" +
                "Üniversite hayatıma ÖSS 2003 Türkiye derecesiyle başladım. Sırasıyla Başkent ve ODTÜ'de Yönetim Bilişim Sistemleri (Lisans-Burslu) ve Tıp Bilişimi(Yüksek Lisans) okudum.");

        User[] users = { student, instructor };
        
    }
}
