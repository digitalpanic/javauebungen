package de.leicheronline.java.bucky.tutorial078;

import java.io.File;

public class Apples {

	public static void main(String[] args) {
		
		File x = new File("C:\\Temp\\Flo.txt");
		
		if(x.exists())
			System.out.println("'" + x.getName() + "'" + " exists!");
		else
			System.out.println("'" + x.getName() + "'" + " doesnt exists!");
	}
}
