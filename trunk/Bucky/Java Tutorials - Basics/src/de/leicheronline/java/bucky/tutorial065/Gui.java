package de.leicheronline.java.bucky.tutorial065;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {

	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italbox;

	public Gui() {
		super("the title");
		setLayout(new FlowLayout());

		tf = new JTextField("This is a sentence", 20);
		tf.setFont(new Font("Arial", Font.PLAIN, 14));
		add(tf);

		boldbox = new JCheckBox("bold");
		italbox = new JCheckBox("italic");
		add(boldbox);
		add(italbox);

		HandlerClass handler = new HandlerClass();
		boldbox.addItemListener(handler);
		italbox.addItemListener(handler);
	}

	private class HandlerClass implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			Font font = null;

			if (boldbox.isSelected() && italbox.isSelected())
				font = new Font("Arial", Font.BOLD + Font.ITALIC, 14);
			else if (boldbox.isSelected())
				font = new Font("Arial", Font.BOLD, 14);
			else if (italbox.isSelected())
				font = new Font("Arial", Font.ITALIC, 14);
			else
				font = new Font("Arial", Font.PLAIN, 14);

			tf.setFont(font);
		}
	}
}
