package de.leicheronline.java.bucky.tutorial052;

import java.awt.FlowLayout; // Layout
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame; // Leisten
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class tuna extends JFrame{
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	public tuna(){
		super("The Title");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("Enter Text Here");
		add(item2);
		
		item3 = new JTextField("unditable", 20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("Mein Passwort");
		add(passwordField);
		
		
		
	}
	
}
