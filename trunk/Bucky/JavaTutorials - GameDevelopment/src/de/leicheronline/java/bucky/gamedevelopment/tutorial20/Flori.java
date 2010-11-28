package de.leicheronline.java.bucky.gamedevelopment.tutorial20;

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

	// Load Images and add Scenes
	public void loadImages() {
		bg = new ImageIcon("C:\\DEV\\Java\\Spielewiese\\TEMP\\back.jpg")
				.getImage();
		Image face1 = new ImageIcon(
				"C:\\DEV\\Java\\Spielewiese\\TEMP\\face.png").getImage();
		Image face2 = new ImageIcon(
				"C:\\DEV\\Java\\Spielewiese\\TEMP\\face1.png").getImage();

		a = new Animation();
		a.addScene(face1, 250);
		a.addScene(face2, 250);

	}

}
