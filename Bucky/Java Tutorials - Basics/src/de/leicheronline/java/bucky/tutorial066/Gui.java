package de.leicheronline.java.bucky.tutorial066;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {

	private JTextField tf;

	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;

	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;

	private ButtonGroup group;


	public Gui(){
		super("The Title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Flo ist hübsch und nett", 25);
		add(tf);
		
		pb = new JRadioButton("plain", true);
		bb = new JRadioButton("bold", false);
		ib = new JRadioButton("italic", false);
		bib = new JRadioButton("bold and italic", false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Arial", Font.PLAIN, 14);
		bf = new Font("Arial", Font.BOLD, 14);
		itf = new Font("Arial", Font.ITALIC, 14);
		bif = new Font("Arial", Font.BOLD + Font.ITALIC, 14);
		
	}

}
