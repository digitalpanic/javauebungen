package de.leicheronline.java.bucky.intermediate.tutorial11;

import java.util.*;

public class Flori {
	public static void main(String[] args) {

		// create an Array and convert it to a list
		Character[] ray = { 'f', 'l', 'o' };
		List<Character> list = Arrays.asList(ray);
		System.out.println("List is : ");
		output(list);

		// reverse an print out the list
		Collections.reverse(list);
		System.out.println("After reversste");
		output(list);

		// create a new array and a new list
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);

		// copy contents of list into listcopy
		Collections.copy(listCopy, list);
		System.out.println("Copy of list : ");
		output(listCopy);

		// fill collection with crap
		Collections.fill(list, 'X');
		System.out.println("After filling the list : ");
		output(list);
	}

	// output method
	private static void output(List<Character> thelist) {
		for (Character thing : thelist)
			System.out.printf("%s ", thing);
		System.out.println();

	}

}
