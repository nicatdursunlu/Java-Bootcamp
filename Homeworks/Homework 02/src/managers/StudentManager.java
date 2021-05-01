package managers;

public class StudentManager extends UserManager{

    public void addComment(String comment) {
        System.out.println("Student's comment: " + comment);
        System.out.println("------------------------------------------------");
    }

    public void addCourses(String[] courses) {
        for (String course: courses) {
            System.out.println("Your course " + course + " added");
            System.out.println("------------------------------------------------");
        }
    }
}
