package de.leicheronline.java.bucky.intermediate.tutorial13;

import java.util.*;

public class Flori {
	public static void main(String[] args) {
		
		//convert stuff array to a list
		String[] stuff = {"äpfel", "schinken", "getreide", "salat"};
		List<String> list1 = Arrays.asList(stuff);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("youtube.com");
		list2.add("google.com");
		list2.add("digg.com");
		
		for(String x : list2)
			System.out.printf("%s ", x);
		
		Collections.addAll(list2, stuff);
		System.out.println();
		
		for(String x : list2)
			System.out.printf("%s ", x);
		System.out.println();
		
		System.out.println(Collections.frequency(list2, "digg.com"));
		System.out.println();
		
		boolean tof = Collections.disjoint(list1, list2);
		System.out.println(tof);
		
		if(tof)
			System.out.println("These lists do not have anything in common");
		else
			System.out.println("These lists must have something in common!");
		
	}

}
