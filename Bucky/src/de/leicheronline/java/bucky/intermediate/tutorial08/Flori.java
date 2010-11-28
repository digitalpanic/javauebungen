package de.leicheronline.java.bucky.intermediate.tutorial08;

import java.util.*;

public class Flori {
	public static void main(String[] args) {

		String[] stuff = { "babies", "watermelons", "melosn", "fudge" };
		// Array zur Liste
		LinkedList<String> thelist = new LinkedList<String>(
				Arrays.asList(stuff));

		thelist.add("punkin");
		thelist.addFirst("Firstthing");

		// List zum Array
		stuff = thelist.toArray(new String[thelist.size()]);

		for (String x : stuff)
			System.out.printf("%s ", x);

	}
}
