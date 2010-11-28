package de.leicheronline.java.bucky.gamedevelopment.tutorial33;

import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyTest extends Core implements KeyListener {
	public static void main(String[] args) {
		new KeyTest().run();
	}

	private String msg = "";
	private String msg2 = "";

	/**
	 * init also call init from superclass
	 * 
	 */
	public void init() {
		super.init();
		Window w = screen.getFullScreenWindow();
		w.setFocusTraversalKeysEnabled(false);
		w.addKeyListener(this);
		msg = "Press escape 'ESC' to Exit";
		msg2 = msg;
	}

	/**
	 * Key Pressed
	 */
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_ESCAPE) {
			// STOP method from Core
			stop();
		} else {
			msg = "Pressed: " + KeyEvent.getKeyText(keyCode);
			// Dont wait for further Keys
			e.consume();
		}

	}

	/**
	 * Key Released
	 */
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		msg = "Released: " + KeyEvent.getKeyText(keyCode);
		// Dont wait for further Keys
		e.consume();
	}

	/**
	 * We don't use this for Games
	 */
	public void keyTyped(KeyEvent e) {
		// Dont wait for further Keys
		e.consume();
	}

	public synchronized void draw(Graphics2D g) {
		Window w = screen.getFullScreenWindow();
		g.setColor(w.getBackground());
		g.fillRect(0, 0, screen.getWidth(), screen.getHeight());
		g.setColor(w.getForeground());
		g.drawString(msg2, 300, 250);
		g.drawString(msg, 300, 300);
	}

}
