package de.leicheronline.java.bucky.tutorial082;

import java.util.*;

public class Sample {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x = 1;

		do {

			try {

				System.out.println("Enter First num: ");
				int n1 = input.nextInt();

				System.out.println("Enter First num: ");
				int n2 = input.nextInt();

				int sum = n1 / n2;
				System.out.println("Das Ergebniss ist: " + sum);
				x=2;
			} catch (Exception e) {
				System.out
						.println("Allgemeiner Fehler - Vorgang nicht möglich");
			}
		} while (x == 1);
	}

}
