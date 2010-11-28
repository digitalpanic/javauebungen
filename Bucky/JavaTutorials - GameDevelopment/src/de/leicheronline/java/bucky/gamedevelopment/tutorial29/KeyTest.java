package de.leicheronline.java.bucky.gamedevelopment.tutorial29;

import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyTest extends Core implements KeyListener {
	public static void main(String[] args) {
		new KeyTest().run();
	}

	private String msg = "";

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
			e.consume();
		}

	}

}
