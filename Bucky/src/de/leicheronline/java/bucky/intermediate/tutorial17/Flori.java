package de.leicheronline.java.bucky.intermediate.tutorial17;

import java.util.*;

public class Flori {
	public static void main(String[] args) {
		
			Integer[] iray = {1,2,3,4,5};
			Character[] cray = {'f','l', 'o', 'r','i'};
			
			printMe(iray);
			printMe(cray);		
	}

	public static void printMe(Integer[]i) {
		for(Integer x : i)
			System.out.printf("%s ", x);
		System.out.println();
	}
	public static void printMe(Character[]i) {
		for(Character x : i)
			System.out.printf("%s ", x);
		System.out.println();
	}
}
