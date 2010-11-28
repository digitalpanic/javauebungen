package de.leicheronline.java.bucky.tutorial068;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {

	private JComboBox box;
	private JLabel picture;

	private static String[] filename = { "b.png", "c.png" };
	private Icon[] pics = { new ImageIcon(getClass().getResource(filename[0])) };

	public Gui() {
		super("The Title");
		setLayout(new FlowLayout());

		box = new JComboBox(filename);

	}

}
