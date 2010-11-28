package de.leicheronline.java.bucky.gamedevelopment.tutorial31;

import java.awt.Graphics;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseInput extends Core implements KeyListener,
		MouseMotionListener, MouseListener, MouseWheelListener {
	public static void main(String[] args) {
		new MouseInput().run();
	}

	private String msg = "";

	/**
	 * Itit calls super init
	 * 
	 */
	public void init() {
		super.init();
		Window w = screen.getFullScreenWindow();
		w.addMouseListener(this);
		w.addMouseMotionListener(this);
		w.addMouseWheelListener(this);
		w.addKeyListener(this);
	}

	/**
	 * Draw Method
	 * 
	 * @param g
	 */
	public synchronized void drae(Graphics g) {
		Window w = screen.getFullScreenWindow();
		g.setColor(w.getBackground());
		g.fillRect(0, 0, screen.getWidth(), screen.getHeight());
		g.setColor(w.getForeground());
		g.drawString(msg, 300, 300);
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseClicked(MouseEvent e) {
		// DO Nothing

	}

	public void mouseEntered(MouseEvent e) {
		// Do Nothing

	}

	public void mouseExited(MouseEvent e) {
		// Do nothing

	}

	public void mousePressed(MouseEvent e) {
		msg = "You pressed down the Mouse";

	}

	public void mouseReleased(MouseEvent e) {
		msg = "You released down the Mouse";

	}

}
