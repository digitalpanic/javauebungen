package de.leicheronline.java.bucky.tutorial063;

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

	public Gui() {
		super("The Title");
		setLayout(new FlowLayout());

		req = new JButton("req Button");
		add(req);

		Icon b = new ImageIcon(getClass().getResource("b.png"));
		Icon c = new ImageIcon(getClass().getResource("c.png"));
		costum = new JButton("Costum", b);
		costum.setRolloverIcon(c);
		add(costum);

		HandlerClass handler = new HandlerClass();
		req.addActionListener(handler);
		costum.addActionListener(handler);

	}

	private class HandlerClass implements ActionListener {
		
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, String.format("%s",event.getActionCommand()));
		}
		
	}

}
