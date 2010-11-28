package de.leicheronline.java.bucky.tutorial047;

public class tuna {
	private String first;
	private String last;
	private static int members = 0;

	public tuna(String firstname, String lastname) {
		first = firstname;
		last = lastname;
		members++;
		System.out.printf("%s %s betritt den Club. Nun Sind %d Personen im Club \n",
				first, last, members);
	}
	public String getFirst(){
		return first;
	}
	public String getLast(){
		return last;
	}
	public static int getMembers(){
		return members;
	}
}
