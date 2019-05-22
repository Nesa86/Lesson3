package exercises;

import java.util.Random;

public class EmailSender {

	void go() {
		/*
		 * Use the methods below to send an email and print a warning if the email did
		 * not send correctly.
		 */

		
	}

	/* Returns true if email was sent successfully, false if it failed to send. */
	boolean send(String greeting) {
		if (this.emailAddress.isBlank()) {
			System.err.println("You did not provide a recipient for the email!");
			return false;
		}
		return new Random().nextBoolean();
	}

	private String emailAddress = "";

	void setEmailAddress(String email) {
		this.emailAddress = email;
	}

	public static void main(String[] args) {
		new EmailSender().go();
	}
}
