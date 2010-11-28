package de.leicheronline.java.bucky.gamedevelopment.tutorial11;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Flori extends JFrame {
	public static void main(String[] args) {

		DisplayMode dm = new DisplayMode(800, 600, 16,
				DisplayMode.REFRESH_RATE_UNKNOWN);
		Flori f = new Flori();
		f.run(dm);

	}

	private Screen screen;
	private Image bg;
	private Animation a;

	/**
	 * Loads Pictures from Computer to Java and adds Scenes
	 * 
	 */
	public void loadPics() {
		bg = new ImageIcon("C:\\DEV\\Java\\Spielewiese\\TEMP\\back.jpg")
				.getImage();
		Image face1 = new ImageIcon(
				"C:\\DEV\\Java\\Spielewiese\\TEMP\\face.png").getImage();
		Image face2 = new ImageIcon(
				"C:\\DEV\\Java\\Spielewiese\\TEMP\\face2.png").getImage();
		a = new Animation();
		a.addScene(face1, 250);
		a.addScene(face2, 250);
	}
	
	/**
	 * Run Methode
	 * 
	 * Sets the Monitor to Fullscreen, Loads the pics, Starts the Movie
	 * 
	 * @param dm
	 */
	public void run(DisplayMode dm){
		screen = new Screen();
		try{
			screen.setFullScreen(dm, new JFrame());
			loadPics();
			movieLoop();
		}finally{
			screen.restoreScreen();
		}
	}

}
