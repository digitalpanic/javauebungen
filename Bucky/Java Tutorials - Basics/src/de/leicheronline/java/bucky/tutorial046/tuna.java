package de.leicheronline.java.bucky.tutorial046;

public class tuna {
	private String first;
	private String last;
	private static int members = 0;

	public tuna(String firstname, String lastname) {
		first = firstname;
		last = lastname;
		members++;
		System.out.printf("Constructor for %s %s, members in the club %d\n",
				first, last, members);
	}
	

}
