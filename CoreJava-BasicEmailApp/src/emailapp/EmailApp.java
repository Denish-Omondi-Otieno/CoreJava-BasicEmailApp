package emailapp;

public class EmailApp {

	/* Basic Project 1 
	Email Application
	Scenario: You are an IT Support Administrator Specialist and are 
	charged with the task of creating email accounts for new hires.
	Your application should do the following:
	1. Generate an email with the following syntax: firstname.lastname@department.company.com
	2. Determine the department (sales, development, accounting and temporary)
	3. Generate a random String for a password
	4. Have set methods to change the password, set the mailbox capacity, and define an alternate email address
	5. Have get methods to display the name, email, and mailbox capacity*/
	
	public static void main(String[] args) {

		// Pass values to our constructor
		Email em1 = new Email("Denish", "Otieno");

		// Set the alternate Email
		em1.setAlternateEmail("denishotienogithub@gmail.com");

		// Call the showInfo method
		System.out.println(em1.showInfo());

	}

}
