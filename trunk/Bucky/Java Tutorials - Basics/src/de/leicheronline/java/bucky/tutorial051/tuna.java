package de.leicheronline.java.bucky.tutorial051;

import java.awt.FlowLayout;  // Layout
import javax.swing.JFrame;  // Leisten
import javax.swing.JLabel; // Texte

public class tuna extends JFrame{
	private JLabel item1;
	
	public tuna(){
		super("The Title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("this is a sentence");
		item1.setToolTipText("This ist gonner show up an hover");
		add(item1);
		
		
		
	}
}
