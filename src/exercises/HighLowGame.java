package exercises;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Random;

public class HighLowGame {

	public static void main(String[] args) {

		

		Random rand = new Random();
		
		int correctNum = rand.nextInt(10);

	

		while (true) {
			Scanner sc = new Scanner(JOptionPane.showInputDialog("Enter a number from 1 to 10"));
		    int guess1 = sc.nextInt();

		    if(guess1 < correctNum){
		    	JOptionPane.showMessageDialog(null, "Number is too low!");
		    }
		    else if(guess1 > correctNum){
		    	JOptionPane.showMessageDialog(null, "Number is too high!");
		    }
		    else if(guess1 == correctNum){
		    	JOptionPane.showMessageDialog(null, "Correct!");
		        break; 
		        
		    }
		    else{
		    	JOptionPane.showMessageDialog(null, "Not valid");
		    }
		}
}}