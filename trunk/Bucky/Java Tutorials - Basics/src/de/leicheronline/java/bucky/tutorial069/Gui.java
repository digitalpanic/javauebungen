package de.leicheronline.java.bucky.tutorial069;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {

	private JComboBox box;
	private JLabel picture;

	private static String[] filename = {"a.png", "b.png", "c.png" };
	private Icon[] pics = { new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1])), new ImageIcon(getClass().getResource(filename[2])) };

	public Gui() {
		super("The Title");
		setLayout(new FlowLayout());

		box = new JComboBox(filename);

		box.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				if (event.getStateChange() == ItemEvent.SELECTED)
					picture.setIcon(pics[box.getSelectedIndex()]);
			}
		}

		);
		
		add(box);
		picture=new JLabel(pics[0]);
		add(picture);

	}

}
