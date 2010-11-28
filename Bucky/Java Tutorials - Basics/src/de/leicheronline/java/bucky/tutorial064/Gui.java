package de.leicheronline.java.bucky.tutorial064;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {
	
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italbox;
	
	public Gui(){
		super("the title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("This is a sentence", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));
		add(tf);
		
		boldbox = new JCheckBox("bold");
		italbox = new JCheckBox("italic");
		add(boldbox);
		add(italbox);
		
		HandlerClass hander = new HandlerClass();
		boldbox.addItemListener(handler);
		italbox.addItemListener(handler);
	}
	
	private HanderClass implements ItemListener{
		
	}
	
}
