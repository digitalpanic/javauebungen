package de.leicheronline.java.bucky.tutorial016;

import java.util.Scanner;

class apples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		
		System.out.println("Gib hier den Namen deiner Freundin ein: ");
		String temp = input.nextLine();
		tunaObject.setName(temp);
		tunaObject.saying();
		
		
	}

}
