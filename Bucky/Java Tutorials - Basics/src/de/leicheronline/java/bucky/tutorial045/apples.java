package de.leicheronline.java.bucky.tutorial045;

import java.util.EnumSet;


public class apples {
	public static void main(String[] args) {
		for(tuna people: tuna.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
	
		System.out.println("\nAnd now for the range of constants!!!\n");
		
		for(tuna people: EnumSet.range(tuna.jessi, tuna.meli))
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
	
	
	}

}
