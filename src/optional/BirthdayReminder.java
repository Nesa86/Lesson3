package optional;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		String momsBirthday = "November 17th";
		String dadsBirthday = "November 11th";
		String myBirthday = "July 6th";

		String answer = JOptionPane.showInputDialog("Which birthday you want to know?");

		JOptionPane.showMessageDialog(null, "You typed: " + answer);

		if (answer.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		} else if (answer.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		} else if (answer.equals("Nenad")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}
	}
}