package de.leicheronline.java.bucky.gamedevelopment.tutorial09;

import java.awt.Image;
import java.util.ArrayList;

public class Animation {

	private ArrayList scenes;
	private int sceneIndex;
	private long movieTime;
	private long totalTime;

	/**
	 * Constructor
	 * 
	 */
	private Animation() {
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
			while(movieTime > getScene(sceneIndex).endTime){
				sceneIndex++;
			}

		}
	}

}
