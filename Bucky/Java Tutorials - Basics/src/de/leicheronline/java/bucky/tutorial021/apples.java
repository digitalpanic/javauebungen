package de.leicheronline.java.bucky.tutorial021;

import java.util.Scanner;

class apples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pupils = 30;
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		while (counter < pupils){
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		average = total/pupils;
		System.out.println("Der durschnitt ist " + average);
	}

}
