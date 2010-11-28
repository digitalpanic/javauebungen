package de.leicheronline.java.bucky.gamedevelopment.tutorial07;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Images extends JFrame {
	public static void main(String[] args) {

		DisplayMode dm = new DisplayMode(800, 600, 16,
				DisplayMode.REFRESH_RATE_UNKNOWN);
		Images i = new Images();
		i.run(dm);

	}

	private Screen s;
	private Image bg;
	private Image pic;
	private boolean loaded;
	

	/**
	 * Run Methode.
	 * 
	 * @param dm
	 */
	private void run(DisplayMode dm) {
		setBackground(Color.GREEN);
		setForeground(Color.RED);
		setFont(new Font("Arial", Font.PLAIN, 24));
		loaded = false;

		s = new Screen();

		try {
			s.setFullScreen(dm, this);
			loadpics();
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// Do Nothing
			}
		} finally {
			s.restoreScreen();
		}

	}

	/**
	 * Load Pictures
	 * 
	 */
	public void loadpics() {
		bg = new ImageIcon("C:\\DEV\\Java\\Spielewiese\\TEMP\\back.jpg").getImage();
		pic = new ImageIcon("C:\\DEV\\Java\\Spielewiese\\TEMP\\face.png").getImage();
		loaded = true;
		repaint();
	}

	public void paint(Graphics g) {
		if (g instanceof Graphics2D) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
					RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
		if(loaded){
			g.drawImage(bg,0,0,null);
			g.drawImage(pic,200,200, null);
		}
	}

}
