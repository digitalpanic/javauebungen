package de.leicheronline.java.bucky.gamedevelopment.tutorial02;

import java.util.*;

public class Apple implements Runnable {
	
	String name;
	int time;
	Random r = new Random();
	
	public Apple(String s){
		name = s;
		time = r.nextInt(5000);
	}
	
	public void run() {
		
		try{
			System.out.printf("%s is sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		}catch(Exception e){
			
		}
		
	}
	
	
	
}
