package de.leicheronline.java.bucky.gamedevelopment.tutorial32;

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
	 * match.
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
		return null;
	}

	/**
	 * Get Current Displaymode.
	 * 
	 * @return
	 */
	public DisplayMode getCurrentDisplayMode() {
		return vc.getDisplayMode();
	}

	/**
	 * Checks if two modes match each other.
	 * 
	 * @param m1
	 * @param m2
	 * @return
	 */
	public boolean displayModesMatch(DisplayMode m1, DisplayMode m2) {
		if (m1.getWidth() != m2.getWidth() || m1.getHeight() != m2.getHeight()) {
			return false;
		}
		if (m1.getBitDepth() != DisplayMode.BIT_DEPTH_MULTI
				&& m2.getBitDepth() != DisplayMode.BIT_DEPTH_MULTI
				&& m1.getBitDepth() != m2.getBitDepth()) {
			return false;
		}
		if (m1.getRefreshRate() != DisplayMode.REFRESH_RATE_UNKNOWN
				&& m2.getRefreshRate() != DisplayMode.REFRESH_RATE_UNKNOWN
				&& m1.getRefreshRate() != m2.getRefreshRate()) {
			return false;
		}
		return true;
	}

	/**
	 * Make Frame FullScreen.
	 * 
	 * @param dm
	 */
	public void setFullScreen(DisplayMode dm) {
		JFrame f = new JFrame();
		f.setUndecorated(true);
		f.setIgnoreRepaint(true);
		f.setResizable(false);
		vc.setFullScreenWindow(f);

		if (dm != null && vc.isDisplayChangeSupported()) {
			try {
				vc.setDisplayMode(dm);
			} catch (Exception ex) {
			}
		}
		f.createBufferStrategy(2);
	}

	/**
	 * We will set Graphics Object equal to this.
	 * 
	 */
	public Graphics2D getGraphics() {
		Window w = vc.getFullScreenWindow();
		if (w != null) {
			BufferStrategy s = w.getBufferStrategy();
			return (Graphics2D) s.getDrawGraphics();
		} else {
			return null;
		}
	}

	/**
	 * Updates display
	 * 
	 */
	public void update() {
		Window w = vc.getFullScreenWindow();
		if (w != null) {
			BufferStrategy s = w.getBufferStrategy();
			if (!s.contentsLost()) {
				s.show();

			}
		}
	}

	/**
	 * Returns Full Screen Window.
	 * 
	 * @return
	 */
	public Window getFullScreenWindow() {
		return vc.getFullScreenWindow();
	}

	/**
	 * Get With
	 * 
	 * @return
	 */
	public int getWidth() {
		Window w = vc.getFullScreenWindow();
		if (w != null) {
			return w.getWidth();
		} else {
			return 0;
		}
	}

	/**
	 * Get Height
	 * 
	 * @return
	 */
	public int getHeight() {
		Window w = vc.getFullScreenWindow();
		if (w != null) {
			return w.getHeight();
		} else {
			return 0;
		}
	}

	/**
	 * Get out of Fullscreen
	 * 
	 */
	public void restoreScreen() {
		Window w = vc.getFullScreenWindow();
		if (w != null) {
			w.dispose();
		}
		vc.setFullScreenWindow(null);
	}

	/**
	 * Create Image Compatible with Monitor
	 * 
	 * @param w
	 *            With
	 * @param h
	 *            Height
	 * @param t
	 *            Transperency
	 * @return
	 */
	public BufferedImage createCompatibleImage(int w, int h, int t) {
		Window win = vc.getFullScreenWindow();
		if (win != null) {
			GraphicsConfiguration gc = win.getGraphicsConfiguration();
			return gc.createCompatibleImage(w, h, t);
		}
		return null;
	}
	
}
