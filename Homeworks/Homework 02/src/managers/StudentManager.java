package managers;

public class StudentManager extends UserManager{

    public void addComment(String comment) {
        System.out.println("Student's comment: " + comment);
        System.out.println("------------------------------------------------");
    }

    // supheli
    public void addCourses(String courses) {
        System.out.println("Your courses " + courses + " added");
        System.out.println("------------------------------------------------");
    }
}
