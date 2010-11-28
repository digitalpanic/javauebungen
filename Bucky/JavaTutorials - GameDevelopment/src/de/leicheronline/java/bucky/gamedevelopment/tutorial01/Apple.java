package de.leicheronline.java.bucky.gamedevelopment.tutorial01;

import java.util.*;

public class Apple implements Runnable {
	
	String name;
	int time;
	Random r = new Random();
	
	public Apple(String s){
		name = s;
		time = r.nextInt(999);
	}
	
	public void run() {
		
		try{
			System.out.printf("%s is sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done", name);
		}catch(Exception e){
			
		}
		
	}
	
	
	
}
