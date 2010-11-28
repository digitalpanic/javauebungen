package de.leicheronline.java.bucky.gamedevelopment.tutorial15;

//Imports
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;

public class ScreenManager extends JFrame {

	// VideoCard
	private GraphicsDevice vc;

	/**
	 * Give vc Acces to the Monitor Screen
	 * 
	 */
	public ScreenManager() {
		GraphicsEnvironment e = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		vc = e.getDefaultScreenDevice();
	}

	/**
	 * Get all compatible DisplayModes
	 * 
	 * @return
	 */
	public DisplayMode[] getCompatibleDislayModes() {
		return vc.getDisplayModes();
	}

	/**
	 * Compares DisplayModes passed in to Videocard Displaymodes an see if they
	 * match
	 * 
	 * @param modes
	 * @return
	 */
	public DisplayMode findFirstCompatibleMode(DisplayMode modes[]) {
		DisplayMode goodModes[] = vc.getDisplayModes();
		for (int x = 0; x < modes.length; x++) {
			for (int y = 0; y < goodModes.length; y++) {
				if (displayModesMatch(modes[x], goodModes[y])) {
					return modes[x];
				}
			}
		}
	}

	/**
	 * Get Current Displaymode
	 * 
	 * @return
	 */
	public DisplayMode getCurrentDisplayMode() {
		return vc.getDisplayMode();
	}

}
