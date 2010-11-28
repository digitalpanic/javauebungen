package de.leicheronline.java.bucky.gamedevelopment.tutorial28;

import java.awt.Window;
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

}
