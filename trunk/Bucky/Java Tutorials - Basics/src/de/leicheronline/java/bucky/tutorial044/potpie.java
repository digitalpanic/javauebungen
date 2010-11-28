package de.leicheronline.java.bucky.tutorial044;

public class potpie {
	private int month;
	private int day;
	private int year;
	
	public potpie(int m, int d, int y){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("Der Konstrukter für das ist %s\n", this);
	}
	
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
}
