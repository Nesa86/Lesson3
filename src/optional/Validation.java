package optional;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			int randomNumber = new Random().nextInt(5);

			System.out.println(randomNumber);

			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null,
						"You're a gift to those around you.");
			}
			if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "You light up the room.!");
			}
			if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null,
						"You are amazing person with unique talents. Have faith in your abilities.");
			}
			if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null,
						"You deserve a hug right now.");
			}
			if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null,
						"You're even more beautiful on the inside than you are on the outside.");
			}
		}

	}
}
