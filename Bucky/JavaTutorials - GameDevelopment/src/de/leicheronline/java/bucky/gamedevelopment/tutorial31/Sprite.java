package de.leicheronline.java.bucky.gamedevelopment.tutorial31;

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

	// Getters and Setters
	/**
	 * @return the x
	 */
	public float getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public float getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * get sprite width
	 * 
	 * @return
	 */
	public int getWidth() {
		return a.getImage().getWidth(null);
	}

	/**
	 * get sprite Height
	 * 
	 * @return
	 */
	public int getHeight() {
		return a.getImage().getHeight(null);
	}

	/**
	 * @return the vx
	 */
	public float getVelocityX() {
		return vx;
	}

	/**
	 * @param vx
	 *            the vx to set
	 */
	public void setVelocityX(float vx) {
		this.vx = vx;
	}

	/**
	 * @return the vy
	 */
	public float getVelocityY() {
		return vy;
	}

	/**
	 * @param vy
	 *            the vy to set
	 */
	public void setVelocityY(float vy) {
		this.vy = vy;
	}

	/**
	 * get sprite or image
	 * 
	 * @return
	 */
	public Image getImage() {
		return a.getImage();
	}

}
