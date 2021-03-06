package de.leicheronline.java.bucky.gamedevelopment.tutorial23;

import java.awt.Image;

public class Sprite {

	private Animation a;
	private float x;
	private float y;
	private float vx;
	private float vy;

	/**
	 * Constructor
	 * 
	 * @param a
	 */
	public Sprite(Animation a) {
		this.a = a;
	}

	/**
	 * Change Position
	 * 
	 * @param timePassed
	 */
	public void update(long timePassed) {
		x += vx * timePassed;
		y += vy * timePassed;
		a.update(timePassed);
	}

}
