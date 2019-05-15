package optional;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw

		// 4. use an if/else statement to set the pen color that the user requested

		// 5. if the user doesn’t enter anything, choose a random color

		// 6. put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 2. set the pen width to 10

		// 1. make the robot draw a shape (this will take more than one line of code)

		Robot robby = new Robot();

		for (int i = 0; i < 10; i++) {

			String ans = JOptionPane.showInputDialog("Type what color would you like the tortoise to draw:");

			if (ans.equals("red")) {
				robby.setPenColor(java.awt.Color.red);
			} else if (ans.equals("blue")) {
				robby.setPenColor(java.awt.Color.blue);
			} else if (ans.equals("yellow")) {
				robby.setPenColor(java.awt.Color.yellow);
			} else {
				robby.setRandomPenColor();
			}
			robby.setPenWidth(10);
			robby.setSpeed(10);
			robby.penDown();
			for (int j = 0; j < 4; j++) {
				robby.move(100);
				robby.turn(90);

			}

		}

	}
}
