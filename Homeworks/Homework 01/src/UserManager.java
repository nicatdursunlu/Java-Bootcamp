
public class UserManager {

	public void add(User user) {
		System.out.println("User " + user.getFirstName() + " " + user.getLastName() + " added succesfully!");
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}
}
