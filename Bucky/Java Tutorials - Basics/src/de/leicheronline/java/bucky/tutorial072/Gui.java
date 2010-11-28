package de.leicheronline.java.bucky.tutorial072;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Gui extends JFrame {

	private JList leftlist;
	private JList rightlist;
	private JButton movebutton;
	private static String[] food = { "bacon", "wings", "ham", "beef",
			"morebakon" };

	public Gui() {
		super("Titel");
		setLayout(new FlowLayout());

		leftlist = new JList(food);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));

		movebutton = new JButton("Move -->");
		movebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				rightlist.setListData(leftlist.getSelectedValues());
			}
		});
		add(movebutton);
	}
}
