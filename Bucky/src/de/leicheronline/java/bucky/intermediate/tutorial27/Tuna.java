package de.leicheronline.java.bucky.intermediate.tutorial27;

import java.util.Random;

//Runnable interface contains run() method
public class Tuna implements Runnable {

	String name;
	int time;
	Random r = new Random();

	public Tuna(String x) {
		name = x;
		time = r.nextInt(5000);

	}

	public void run() {
		try {
			System.out.printf("%s is sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		} catch (Exception e) {

		}
	}

}
