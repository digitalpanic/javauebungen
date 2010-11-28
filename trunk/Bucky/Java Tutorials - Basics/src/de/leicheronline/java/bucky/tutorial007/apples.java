package de.leicheronline.java.bucky.tutorial007;

import java.util.Scanner;

public class apples {

	public static void main(String args[]) {
		Scanner flori = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.print("Erste Zahl eingeben: ");
		fnum = flori.nextDouble();
		System.out.print("Zweite Zahl eingeben: ");
		snum = flori.nextDouble();
		answer = fnum + snum;
		System.out.print("Die Summe der Zahlen ist: ");
		System.out.println(answer);

	}
}
