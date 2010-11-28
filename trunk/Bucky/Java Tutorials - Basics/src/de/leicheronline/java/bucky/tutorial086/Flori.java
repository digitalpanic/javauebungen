package de.leicheronline.java.bucky.tutorial086;

import java.awt.Color;

import javax.swing.JFrame;

public class Flori {
	public static void main(String[] args) {

		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Peach p = new Peach();
		p.setBackground(Color.WHITE);
		f.add(p);
		f.setSize(500, 270);
		f.setVisible(true);

	}

}