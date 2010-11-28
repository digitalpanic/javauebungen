package de.leicheronline.java.bucky.gamedevelopment.tutorial22;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Flori /* extends JFrame */{
	public static void main(String[] args) {
		Flori f = new Flori();
		f.run();
	}

	private Animation a;
	private ScreenManager s;
	private Image bg;
	private static final DisplayMode modes1[] = {
			new DisplayMode(800, 600, 32, 0), new DisplayMode(800, 600, 24, 0),
			new DisplayMode(800, 600, 16, 0), new DisplayMode(640, 480, 32, 0),
			new DisplayMode(640, 480, 24, 0), new DisplayMode(640, 480, 16, 0), };

	/**
	 * Load Images and add Scenes
	 */
	public void loadImages() {
		bg = new ImageIcon("C:\\DEV\\Java\\Spielewiese\\TEMP\\back.jpg")
				.getImage();
		Image face1 = new ImageIcon(
				"C:\\DEV\\Java\\Spielewiese\\TEMP\\face.png").getImage();
		Image face2 = new ImageIcon(
				"C:\\DEV\\Java\\Spielewiese\\TEMP\\face1.png").getImage();
		Image face3 = new ImageIcon(
				"C:\\DEV\\Java\\Spielewiese\\TEMP\\face2.png").getImage();

		a = new Animation();
		a.addScene(face1, 250);
		a.addScene(face2, 250);
		a.addScene(face3, 250);
	}

	/**
	 * Main Method called from main
	 * 
	 */
	public void run() {
		s = new ScreenManager();
		try {
			DisplayMode dm = s.findFirstCompatibleMode(modes1);
			s.setFullScreen(dm);
			loadImages();
			movieLoop();
		} finally {
			s.restoreScreen();
		}
	}

	/**
	 * Play Movies
	 */
	public void movieLoop() {
		long startingTime = System.currentTimeMillis();
		long cumTime = startingTime;
		while (cumTime - startingTime < 10000) {
			long timePassed = System.currentTimeMillis() - cumTime;
			cumTime += timePassed;
			a.update(timePassed);

			// draw and update the screen
			Graphics2D g = s.getGraphics();
			draw(g);
			g.dispose();
			s.update();
			try {
				Thread.sleep(20);
			} catch (Exception ex) {
			}

		}

	}

	/**
	 * Draw Graphics
	 * 
	 * @param g
	 */
	public void draw(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		
		g.drawImage(a.getImage(), 350, 250, null);
		
		g.drawImage(a.getImage(), 0, 250, null);
		g.drawImage(a.getImage(), 100, 250, null);
		g.drawImage(a.getImage(), 200, 250, null);
		g.drawImage(a.getImage(), 300, 250, null);
		g.drawImage(a.getImage(), 400, 250, null);
		g.drawImage(a.getImage(), 500, 250, null);
		g.drawImage(a.getImage(), 600, 250, null);
		g.drawImage(a.getImage(), 700, 250, null);
		g.drawImage(a.getImage(), 800, 250, null);

		g.drawImage(a.getImage(), 0, 0, null);
		g.drawImage(a.getImage(), 100, 0, null);
		g.drawImage(a.getImage(), 200, 0, null);
		g.drawImage(a.getImage(), 300, 0, null);
		g.drawImage(a.getImage(), 400, 0, null);
		g.drawImage(a.getImage(), 500, 0, null);
		g.drawImage(a.getImage(), 600, 0, null);
		g.drawImage(a.getImage(), 700, 0, null);
		g.drawImage(a.getImage(), 800, 0, null);

		g.drawImage(a.getImage(), 0, 500, null);
		g.drawImage(a.getImage(), 100, 500, null);
		g.drawImage(a.getImage(), 200, 500, null);
		g.drawImage(a.getImage(), 300, 500, null);
		g.drawImage(a.getImage(), 400, 500, null);
		g.drawImage(a.getImage(), 500, 500, null);
		g.drawImage(a.getImage(), 600, 500, null);
		g.drawImage(a.getImage(), 700, 500, null);
		g.drawImage(a.getImage(), 800, 500, null);

	}
}
