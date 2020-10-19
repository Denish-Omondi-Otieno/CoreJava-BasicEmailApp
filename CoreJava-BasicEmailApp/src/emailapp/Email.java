package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private String email;
	private String companySuffix = "company.com";
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 8;

	// Constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		System.out.println("Email Created for: " + "" + this.firstName + " " + this.lastName);

		// Call a method asking for the department - return the department
		this.department = setDepartment();
		// System.out.println("Department: " + " " + this.department);

		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		// System.out.println("Your password is: " + this.password);

		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		// System.out.println("Your email is: " + email);
	}

	// Ask for the department
	private String setDepartment() {
		System.out.println(
				"Enter your Department Code: \nDepartment Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for Temporay\nEnter the deparment:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "dev";
		} else if (depChoice == 3) {
			return "acct";
		} else {
			return "temporary";
		}
	}

	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// Set the mail box capacity (Encapsulation)
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;

	}

	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// Change the password
	public void changePassword(String password) {
		this.password = password;

	}

	// Get methods
	public int getmailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	// Show all information
	public String showInfo() {
		return "\nDisplay Name: " + firstName + " " + lastName + "\nDepartment: " + department + "\nCompany Email: "
				+ email + "\nMailBox Capacity: " + mailboxCapacity + "mb";
	}

}