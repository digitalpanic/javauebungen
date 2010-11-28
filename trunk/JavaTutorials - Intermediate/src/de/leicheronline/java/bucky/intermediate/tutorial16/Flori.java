package de.leicheronline.java.bucky.intermediate.tutorial16;

import java.util.*;

public class Flori {
	public static void main(String[] args) {
		
		String[] things = {"apples", "bob", "ham", "bob","bacon"};
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s ", list);
		System.out.println();
		
		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s ", set);
		System.out.println();
		
		
	}
}
