package de.leicheronline.java.bucky.tutorial071;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Gui extends JFrame {

	private JList list;
	private static String[] colornames = { "black", "blue", "red", "cyan", "white", "HSB" };
	private static Color[] colors = { Color.BLACK, Color.BLUE, Color.RED, Color.CYAN, 
			Color.WHITE, Color.getHSBColor(255, 32, 32) };

	public Gui() {
		super("title");
		setLayout(new FlowLayout());

		list = new JList(colornames);
		list.setVisibleRowCount(6);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));

		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				getContentPane().setBackground(colors[list.getSelectedIndex()]);
			}
		});

	}

}
