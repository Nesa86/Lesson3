package optional;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	/*
	 * Ask the user how many hours they spent coding this week.
	 * 
	 * 1. If it's 3 or more, tell them they're a Code Ninja.
	 * 
	 * 2. If it's less than 2, tell them to stop watching YouTube and write code
	 * instead.
	 * 
	 * 3. If it's more than 5, play the Batman theme song.
	 */

	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("How many hours have you spent coding this week?");
		int hours = Integer.parseInt(answer);

		if (hours > 2) {
			JOptionPane.showMessageDialog(null, "You are a Code Ninja.");
			if (hours > 24 * 7) {
				JOptionPane.showMessageDialog(null, "If we were kidding!");
				JOptionPane.showMessageDialog(null, "Week only lasts " + 24 * 7 + " hours. So, Nice try ;)");
			} else if (hours > 7 * 20)
				JOptionPane.showMessageDialog(null, "You should get some sleep...");
			else if (hours > 5)
				playBatmanTheme();
		} else
			JOptionPane.showMessageDialog(null, "Stop playing games and write some code.");
	}

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
