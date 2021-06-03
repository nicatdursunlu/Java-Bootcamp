
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		Instructor instructor = new Instructor();
		
		student.setId(1);
		student.setFirstName("Nijat");
		student.setLastName("Dursunlu");
		
		instructor.setId(11);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		
		UserManager userManager = new UserManager();
		User[] users = { student, instructor };
		userManager.addMultiple(users);
	}
}
