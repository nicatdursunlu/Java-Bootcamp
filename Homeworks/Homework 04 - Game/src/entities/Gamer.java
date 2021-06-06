package entities;

import java.time.LocalDate;

public class Gamer extends Customer {
	private String username;
	
	public Gamer() {}

	public Gamer(int id, String email, String firstName, String lastName, LocalDate dateOfBirth,
			String nationalityId, String username) {
		super(id, email, firstName, lastName, dateOfBirth, nationalityId);
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
