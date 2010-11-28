package de.leicheronline.java.bucky.tutorial084;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peach extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 325, 25);
		
		g.setColor(new Color(190,81,215));
		g.fillRect(25, 65, 325, 25);
		
		g.setColor(Color.RED);
		g.drawString("this is a Text", 25,120);
		
	}
	
}
