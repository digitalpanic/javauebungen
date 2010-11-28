package de.leicheronline.java.bucky.intermediate.tutorial04;

import java.util.*;

public class Flori {
	public static void main (String args[]){
		
		String[] things = {"eggs", "lasers", "hats", "pie"};
		List<String> list1 = new ArrayList<String>();
		
		//add Arrayitems to list
		for(String x : things)
			list1.add(x);
		
		
		String[] morethings = {"lasers", "hats"};
		List<String> list2 = new ArrayList<String>();
		
		for(String y : morethings)
			list2.add(y);
		
		for(int i = 0; i<list1.size();i++){
			System.out.printf("%s ", list1.get(i));
		}
		System.out.println();
		for(int i = 0; i<list2.size();i++){
			System.out.printf("%s ", list2.get(i));
		}
		
	}

}
