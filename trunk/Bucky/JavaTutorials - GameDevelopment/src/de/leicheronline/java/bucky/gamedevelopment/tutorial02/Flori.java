package de.leicheronline.java.bucky.gamedevelopment.tutorial02;

public class Flori {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Apple("1"));
		Thread t2 = new Thread(new Apple("2"));
		Thread t3 = new Thread(new Apple("3"));
		Thread t4 = new Thread(new Apple("4"));
		Thread t5 = new Thread(new Apple("5"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
