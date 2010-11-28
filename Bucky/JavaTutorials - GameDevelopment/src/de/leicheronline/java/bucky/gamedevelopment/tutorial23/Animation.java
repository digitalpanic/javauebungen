package de.leicheronline.java.bucky.gamedevelopment.tutorial23;

//Imports
import java.awt.Image;
import java.util.ArrayList;

public class Animation {

	// Deklarationen
	private ArrayList scenes;
	private int sceneIndex;
	private long movieTime;
	private long totalTime;

	/**
	 * Constructor
	 * 
	 */
	public Animation() {
		scenes = new ArrayList();
		totalTime = 0;
		start();
	}

	/**
	 * Add Scene to Arraylist and set Time for each scene
	 * 
	 * @param i
	 * @param t
	 */
	public synchronized void addScene(Image i, long t) {
		totalTime += t;
		scenes.add(new OneScene(i, totalTime));
	}

	/**
	 * Start Animation form beginning
	 * 
	 */
	public synchronized void start() {
		movieTime = 0;
		sceneIndex = 0;
	}

	/**
	 * Change Scenes
	 * 
	 * @param timePassed
	 */
	public synchronized void update(long timePassed) {
		if (scenes.size() > 1) {

			movieTime += timePassed;
			if (movieTime >= totalTime) {
				movieTime = 0;
				sceneIndex = 0;
			}
			while (movieTime > getScene(sceneIndex).endTime) {
				sceneIndex++;
			}

		}
	}

	/**
	 * Get Animations current scene (aka image)
	 * 
	 */
	public synchronized Image getImage() {
		if (scenes.size() == 0) {
			return null;
		} else {
			return getScene(sceneIndex).pic;
		}
	}

	/**
	 * Get Scene
	 * 
	 * @param x
	 * @return
	 */
	private OneScene getScene(int x) {
		return (OneScene) scenes.get(x);
	}

	////// PRIVATE INNER CLASS //////
	private class OneScene {
		Image pic;
		long endTime;

		public OneScene(Image pic, long endTime) {
			this.pic = pic;
			this.endTime = endTime;
		}
	}

}
