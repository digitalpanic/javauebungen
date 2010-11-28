package de.leicheronline.java.bucky.gamedevelopment.tutorial25;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;

public class Flori /* extends JFrame */{
	public static void main(String[] args) {
		Flori f = new Flori();
		f.run();
	}

	private Sprite sprite;
	private Animation animation;
	private ScreenManager screenManager;
	private Image backGround;
	private static final DisplayMode modes1[] = {
			new DisplayMode(800, 600, 32, 0), new DisplayMode(800, 600, 24, 0),
			new DisplayMode(800, 600, 16, 0), new DisplayMode(640, 480, 32, 0),
			new DisplayMode(640, 480, 24, 0), new DisplayMode(640, 480, 16, 0), };

	/**
	 * Load Images and add Scenes
	 */
	public void loadImages() {
		backGround = new ImageIcon("C:\\DEV\\Java\\Spielewiese\\TEMP\\back.jpg")
				.getImage();
		Image face1 = new ImageIcon(
				"C:\\DEV\\Java\\Spielewiese\\TEMP\\face.png").getImage();
		Image face2 = new ImageIcon(
				"C:\\DEV\\Java\\Spielewiese\\TEMP\\face1.png").getImage();
		Image face3 = new ImageIcon(
				"C:\\DEV\\Java\\Spielewiese\\TEMP\\face2.png").getImage();

		animation = new Animation();
		animation.addScene(face1, 250);
		animation.addScene(face2, 250);
		animation.addScene(face3, 250);

		sprite = new Sprite(animation);
		sprite.setVelocityX(0.3f);
		sprite.setVelocityY(0.3f);

	}

	/**
	 * Main Method called from main
	 * 
	 */
	public void run() {
		screenManager = new ScreenManager();
		try {
			DisplayMode dm = screenManager.findFirstCompatibleMode(modes1);
			screenManager.setFullScreen(dm);
			loadImages();
			movieLoop();
		} finally {
			screenManager.restoreScreen();
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
			// animation.update(timePassed);
			update(timePassed);

			// draw and update the screen
			Graphics2D g = screenManager.getGraphics();
			draw(g);
			g.dispose();
			screenManager.update();
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
		g.drawImage(backGround, 0, 0, null);
		g.drawImage(sprite.getImage(), Math.round(sprite.getX()),Math.round(sprite.getY()),null);
		


	}
}
