package de.leicheronline.java.bucky.gamedevelopment.tutorial32;

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
	private ScreenManager screen;
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
		Image face4 = new ImageIcon(
				"C:\\DEV\\Java\\Spielewiese\\TEMP\\hund.png").getImage();
		Image face5 = new ImageIcon(
		"C:\\DEV\\Java\\Spielewiese\\TEMP\\katze.png").getImage();
		Image face6 = new ImageIcon(
		"C:\\DEV\\Java\\Spielewiese\\TEMP\\hai.png").getImage();

		animation = new Animation();
		animation.addScene(face1, 250);
		animation.addScene(face2, 250);
		animation.addScene(face3, 250);
		animation.addScene(face4, 250);
		animation.addScene(face5, 250);
		animation.addScene(face6, 250);

		sprite = new Sprite(animation);
		sprite.setVelocityX(0.1f);
		sprite.setVelocityY(0.1f);

	}

	/**
	 * Main Method called from main
	 * 
	 */
	public void run() {
		screen = new ScreenManager();
		try {
			DisplayMode dm = screen.findFirstCompatibleMode(modes1);
			screen.setFullScreen(dm);
			loadImages();
			movieLoop();
		} finally {
			screen.restoreScreen();
		}
	}

	/**
	 * Play Movies
	 */
	public void movieLoop() {
		long startingTime = System.currentTimeMillis();
		long cumTime = startingTime;
		while (cumTime - startingTime < 30000) {
			long timePassed = System.currentTimeMillis() - cumTime;
			cumTime += timePassed;
			// animation.update(timePassed);
			update(timePassed);

			// draw and update the screen
			Graphics2D g = screen.getGraphics();
			draw(g);
			g.dispose();
			screen.update();
			try {
				Thread.sleep(10);
			} catch (Exception ex) {
			}

		}

	}

	/**
	 * Update Sprite
	 * 
	 * @param timePassed
	 */
	public void update(long timePassed) {
		if (sprite.getX() < 0) {
			sprite.setVelocityX(Math.abs(sprite.getVelocityX()));
		} else if (sprite.getX() + sprite.getWidth() >= screen.getWidth()) {
			sprite.setVelocityX(-Math.abs(sprite.getVelocityX()));
		}

		if (sprite.getY() < 0) {
			sprite.setVelocityY(Math.abs(sprite.getVelocityY()));
		} else if (sprite.getY() + sprite.getHeight() >= screen.getHeight()) {
			sprite.setVelocityY(-Math.abs(sprite.getVelocityY()));
		}

		sprite.update(timePassed);

	}

	/**
	 * Draw Graphics
	 * 
	 * @param g
	 */
	public void draw(Graphics g) {
		g.drawImage(backGround, 0, 0, null);
		g.drawImage(sprite.getImage(), Math.round(sprite.getX()),
				Math.round(sprite.getY()), null);


	}
}
