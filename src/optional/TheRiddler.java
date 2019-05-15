package optional;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.

		int score = 0;

		String ans = JOptionPane.showInputDialog(
				"I sleep by day, I fly by night. I have no feathers to aid my flight. \nI use the noise to find my way"
						+ " see without seeing, to me," + "the darkness is as clear as a day.\nWhat am I?");

		if (ans.equalsIgnoreCase("bat")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! \nThe answer is simple - bat.");
		}

		ans = JOptionPane.showInputDialog("You throw away my outside you cook my inside, then you eat my outside "
				+ "and throw away my inside.\nWhat am I?");

		if (ans.equalsIgnoreCase("corn")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! \nThe answer is simple - a corn.");
		}

		ans = JOptionPane.showInputDialog("I have beaches without sand, towns without people, oceans without water,"
				+ " and mountains without land all on my shoulders.\nWhat am I??");

		if (ans.equalsIgnoreCase("map")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! \nThe answer is simple - a map.");
		}

		ans = JOptionPane.showInputDialog(
				"Tool of thief toy of queen Always used to be unseen.\nSign of joy sign of sorrow giving all likeness borrowed?\nWhat am I?");

		if (ans.equalsIgnoreCase("mask")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! \nThe answer is simple - a mask.");
		}
		int method = JOptionPane.showOptionDialog(null, "Would you like the bonus riddle? This one can double your score", "Bonus!!!", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes", "No" }, null);

		if (method == 0) {
			ans = JOptionPane.showInputDialog("A prisoner is told: If you tell a lie we will hang you, "
					+ "if you tell truth we will shoot you. \nWhat can he say to save himself?");

			if (ans.equalsIgnoreCase("You will hang me")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score = score*2;
			} else {
				JOptionPane.showMessageDialog(null, "Wrong! \nHere is the explanation - if “you will hang me” is a lie, then I wouldn't be hanged at all.\n"
						+ "And I will only get shot if I tell the truth. And if it's the truth, that means I won't be shot, as “you will not shoot me” becomes true."
						+ "And I would only be hanged if I tell a lie.");

				{

					JOptionPane.showMessageDialog(null, "Your score is " + score);
				}
			}
			JOptionPane.showMessageDialog(null, "Your score is " + score);
		}
	}
}