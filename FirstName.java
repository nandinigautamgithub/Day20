import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class FirstName {

	public static final String EXPECTED_FIRST_NAME = "Satyendra";
	public static final String EXPECTED_LAST_NAME = "Mishra";
	public static final String EXPECTED_EMAIL_ID = "satyam12@gmail.com";
	public static final String EXPECTED_PASSWORD = "Mishra@123";
	public static final String EXPECTED_CONTACT_NUMBER = "9162345367";
	private User user;

	@Before
	public void setUp() throws Exception {
		user = new User("Satyendra", "Mishra", "satyam12@gmail.com", "Mishra@123", "9162345367");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test Completed");
	}

	@Test
	public void testUserDetails() throws Exception {
		Assert.assertEquals(EXPECTED_FIRST_NAME, user.getFirstName());
		Assert.assertEquals(EXPECTED_LAST_NAME, user.getLastName());
		Assert.assertEquals(EXPECTED_EMAIL_ID, user.getEmailId());
		Assert.assertEquals(EXPECTED_PASSWORD, user.getPassword());
		Assert.assertEquals(EXPECTED_CONTACT_NUMBER, user.getContactNumber());
	}

}
