package managers;

import models.Instructor;

public class InstructorManager extends UserManager {

    public void add(Instructor instructor) {
        System.out.println("Instructor " + instructor.getFirstName() + " " + instructor.getLastName() + " added!");
        System.out.println("------------------------------------------------");
    }
}
