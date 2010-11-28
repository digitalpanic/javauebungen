package de.leicheronline.java.bucky.tutorial084;

import javax.swing.JFrame;

public class Flori {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Titel");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Peach p = new Peach();
		f.add(p);
		f.setSize(400,250);
		f.setVisible(true);
		

	}

}
