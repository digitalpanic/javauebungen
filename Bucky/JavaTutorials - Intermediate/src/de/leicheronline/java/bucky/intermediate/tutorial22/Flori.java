package de.leicheronline.java.bucky.intermediate.tutorial22;

import java.awt.*;
import javax.swing.*;

public class Flori extends JApplet{
	
	private double sum;
	
	public void init(){
		String fn = JOptionPane.showInputDialog("Enter first Number");
		String sn = JOptionPane.showInputDialog("Enter second Number");
		
		double n1 = Double.parseDouble(fn);
		double n2 = Double.parseDouble(sn);
		
		sum = n1 + n2;
				
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("The sum is "+sum, 25, 40);
	}
	
}
