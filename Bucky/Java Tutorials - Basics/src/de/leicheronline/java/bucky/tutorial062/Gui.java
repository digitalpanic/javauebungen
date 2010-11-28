package de.leicheronline.java.bucky.tutorial062;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Gui extends JFrame {
	
	private JButton req;
	private JButton costum;
	
	public Gui(){
		super("The Title");
		setLayout(new FlowLayout());
		
		req = new JButton("req Button");
		add(req);
		
		Icon b = new ImageIcon(getClass().getResource("b.png"));
		Icon c = new ImageIcon(getClass().getResource("c.png"));
		costum = new JButton("Costum", b);
		costum.setRolloverIcon(c);
		add(costum);
		
	}
	
}
