package de.leicheronline.java.bucky.gamedevelopment.tutorial34;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyListener;
import java.awt.event.MouseMotionListener;

import javax.sql.rowset.spi.SyncFactory;
import javax.swing.ImageIcon;

import de.leicheronline.java.bucky.gamedevelopment.tutorial32.Core;

public class Look extends Core implements MouseMotionListener, KeyListener {
	public static void main(String[] args) {
		new Look().run();
	}

	private Image background;
	private Robot robot;
	private Point mouse;
	private Point center;
	private Point image;
	private boolean centering;

	/**
	 * Init Main Method
	 * 
	 */
	public void init() {
		super.init();
		mouse = new Point();
		center = new Point();
		image = new Point();
		centering = false;

		try {
			robot = new Robot();
			recenterMouse();
			mouse.x = center.x;
			mouse.y = center.y;
		} catch (Exception ex) {
			System.out.println("Fehler Numer: 1");
		}

		Window w = screen.getFullScreenWindow();
		w.addMouseMotionListener(this);
		w.addKeyListener(this);
		background = new ImageIcon("C:\\DEV\\Java\\Spielewiese\\TEMP\\back.jpg")
				.getImage();

	}

	/**
	 * Draw Method
	 * 
	 */
	public synchronized void draw(Graphics2D g) {
		int w = screen.getWidth();
		int h = screen.getHeight();

		image.x %= w;
		image.y %= h;

		if (image.x < 0) {
			image.x += w;
		}

		if (image.y < 0) {
			image.y += h;
		}
		int x = image.x;
		int y = image.y;

		g.drawImage(background, x, y, null);
		g.drawImage(background, x-w, y, null);
		g.drawImage(background, x, y-h, null);
		g.drawImage(background, x-w, y-h, null);

	}

}
