package de.leicheronline.java.bucky.gamedevelopment.tutorial32;

import java.awt.Graphics2D;
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

	private String msgkey = "You haven't pressed a Key yet";
	private String msgexit = "Press escape 'ESC' to Exit";
	private String msgmouse = "You haven't moved the Mouse yet";

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
	public synchronized void draw(Graphics2D g) {
		Window w = screen.getFullScreenWindow();
		g.setColor(w.getBackground());
		g.fillRect(0, 0, screen.getWidth(), screen.getHeight());
		g.setColor(w.getForeground());
		g.drawString(msgexit, 300, 250);
		g.drawString(msgkey, 300, 300);
		g.drawString(msgmouse, 300, 350);
	}

	// Mouse Listener Interface
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
		msgmouse = "You pressed down the Mouse";

	}

	public void mouseReleased(MouseEvent e) {
		msgmouse = "You released down the Mouse";

	}

	// Mouse Motion Interface
	public void mouseDragged(MouseEvent e) {
		msgmouse = "You are Dragging the Mouse";

	}

	public void mouseMoved(MouseEvent e) {
		msgmouse = "You are Moving the Mouse";

	}

	// Mouse Wheel interface
	public void mouseWheelMoved(MouseWheelEvent e) {
		msgmouse = "You are scrolling the Mouse";

	}

	/**
	 * Key Pressed.
	 */
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_ESCAPE) {
			// STOP method from Core
			stop();
		} else {
			msgkey = "Pressed: " + KeyEvent.getKeyText(keyCode);
			// Dont wait for further Keys
			e.consume();
		}

	}

	/**
	 * Key Released.
	 */
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		msgkey = "Released: " + KeyEvent.getKeyText(keyCode);
		// Dont wait for further Keys
		e.consume();
	}

	/**
	 * keyTyped.
	 * 
	 * We don't use this for Games
	 */
	public void keyTyped(KeyEvent e) {
		// Dont wait for further Keys
		e.consume();
	}

}
