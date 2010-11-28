package de.leicheronline.java.bucky.tutorial075;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class Gui extends JFrame {
	
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public Gui(){
		super("Titel");
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		
		Handlerclass handler = new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
		
	}
	
	private class HandlerClass implements MouseListener, MouseMotionListener{

		//MOUSTELISTENER
		public void mouseReleased(MouseEvent event) {
			statusbar.setText("You released the Mouse");	
		}

		public void mouseClicked(MouseEvent event) {
			statusbar.setText(String.format("Clicked at %d,%d", event.getX(),event.getY()));
		}
		
		public void mousePressed(MouseEvent event) {
			statusbar.setText("You presst down the Mouse");	
		}

		public void mouseEntered(MouseEvent event) {
			statusbar.setText("You entered the Area");
			mousepanel.setBackground(Color.RED);			
		}

		public void mouseExited(MouseEvent event) {
			statusbar.setText("The Mouse has left the Window");
			mousepanel.setBackground(Color.WHITE);
			
		}
		
		//MOUSEMOTIONLISTENER
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		

		
		
	}
	
	
}
