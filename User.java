
public class User {
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String contactNumber;

	public User(String firstName, String lastName, String emailId, String password, String contactNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.contactNumber = contactNumber;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPassword() {
		return password;
	}

	public String getContactNumber() {
		return contactNumber;
	}

}
