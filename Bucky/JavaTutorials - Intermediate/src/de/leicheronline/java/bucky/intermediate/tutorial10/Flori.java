package de.leicheronline.java.bucky.intermediate.tutorial10;

import java.util.*;

public class Flori {
	public static void main(String[] args) {
		
		//create an Array and convert it to a list
		Character[] ray = {'f','f','o'};
		List<Character> list = Arrays.asList(ray);
		System.out.println("List is : ");
		output(list);
		
		//reverse an print out the list
		Collections.reverse(list);
		System.out.println("After reversste");
		output(list);
		
		//create a new array and a new list
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		
		//copy contents of list into listcopy
		Collections.copy(listCopy, list);
		output(listCopy);
		
		
	}
	
	
}
