package de.leicheronline.java.bucky.tutorial079;

import java.util.*;


public class Apples {

	public static void main(String[] args) {
		
		final Formatter x;
		
		try{
			x = new Formatter("fred.txt");
			System.out.println("You created a File");
		} catch(Exception e){
			System.out.println("You got an error");
		}
		
		}
}
