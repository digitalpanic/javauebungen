package de.leicheronline.java.bucky.tutorial015;

import java.util.Scanner;

class apples {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		
		System.out.println("Enter your Name here: ");
		String name = input.nextLine();
		
		tunaObject.simpleMessage(name);
		
		
	}

}
