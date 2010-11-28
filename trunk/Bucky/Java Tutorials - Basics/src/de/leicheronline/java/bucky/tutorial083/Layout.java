package de.leicheronline.java.bucky.tutorial083;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Layout extends JFrame {

	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout layout;
	private Container container;

	public Layout() {
		super("The Title");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);

		//Links
		lb = new JButton("<");
		add(lb);
		lb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				layout.setAlignment(FlowLayout.LEFT);
				layout.layoutContainer(container);
			}
		});
		
		//Mitte
		cb = new JButton("-");
		add(cb);
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				layout.setAlignment(FlowLayout.CENTER);
				layout.layoutContainer(container);
			}
		});
		
		//Rechts
		rb = new JButton(">");
		add(rb);
		rb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				layout.setAlignment(FlowLayout.RIGHT);
				layout.layoutContainer(container);
			}
		});

	}

}