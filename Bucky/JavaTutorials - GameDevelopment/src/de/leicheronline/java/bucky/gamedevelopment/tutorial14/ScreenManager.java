package de.leicheronline.java.bucky.gamedevelopment.tutorial14;

//Imports
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;

public class ScreenManager extends JFrame{
	
	//vc = Grafikkarte
	private GraphicsDevice vc;
	
	/**
	 * Give vc Acces to the Monitor Screen
	 * 
	 */
	public ScreenManager(){
		GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
		vc = e.getDefaultScreenDevice();
	}
	
	/**
	 * Get all compatible DisplayModes
	 * @return
	 */
	public DisplayMode[] getCompatibleDislayModes(){
		return vc.getDisplayModes();
	}
	
}
