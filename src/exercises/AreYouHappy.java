package exercises;

import javax.swing.JOptionPane;

/* See the diagram in the "doc" directory. */

public class AreYouHappy {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("Are you happy?");
		if (answer.contentEquals("yes")) {

			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
		}

		else if (answer.contentEquals("no")) {
			String answer2 = JOptionPane.showInputDialog("Do you want to be happy?");
			{
				if (answer2.contentEquals("yes")) {

					JOptionPane.showMessageDialog(null, "Change something");
				} else

				{
					JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
				}

			}
		} else {
			JOptionPane.showMessageDialog(null, "Unknown entry");
		}
	}
}