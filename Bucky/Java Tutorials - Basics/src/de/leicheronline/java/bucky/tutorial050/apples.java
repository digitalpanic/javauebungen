package de.leicheronline.java.bucky.tutorial050;

import javax.swing.JOptionPane;

public class apples {
	public static void main(String[] args) {
		String firstNumber = JOptionPane.showInputDialog("Erste Nummer eingeben");
		String secondNumber = JOptionPane.showInputDialog("Zweite Nummer eingeben");
		
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		
		int sum = number1 + number2;
		
		JOptionPane.showMessageDialog(null, "Die Summe ist: " + sum, "The Title", JOptionPane.INFORMATION_MESSAGE);
		
		
	}
}