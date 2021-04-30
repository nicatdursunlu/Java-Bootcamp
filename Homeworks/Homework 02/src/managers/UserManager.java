package managers;

import models.User;

public class UserManager {

    public void register(User user) {
        System.out.println("You have successfully registered!.");
        System.out.println("------------------------------------------------");
    }

    public void add(User user) {
        System.out.println("User " + user.getFirstName() + " " + user.getLastName() + " is successfully added!");
        System.out.println("------------------------------------------------");
    }

    public void update(User user) {
        System.out.println("User " + user.getFirstName() + " " + user.getLastName() + " is updated!");
        System.out.println("------------------------------------------------");
    }

    public void remove(User user) {
        System.out.println("User " + user.getFirstName() + " " + user.getLastName() + " is removed!");
        System.out.println("------------------------------------------------");
    }

}
