package de.leicheronline.java.bucky.gamedevelopment.tutorial32;

import java.awt.*;

public abstract class Core {

	private static DisplayMode modes[] = { new DisplayMode(800, 600, 32, 0),
			new DisplayMode(800, 600, 24, 0), new DisplayMode(800, 600, 16, 0),
			new DisplayMode(640, 480, 32, 0), new DisplayMode(640, 480, 24, 0),
			new DisplayMode(640, 480, 16, 0), };

	private boolean running;
	protected ScreenManager screen;

	/**
	 * Stop method
	 */
	public void stop() {
		running = false;
	}

	/**
	 * Call init and gameloop
	 */
	public void run() {
		try {
			init();
			gameLoop();
		} finally {
			screen.restoreScreen();
		}
	}

	/**
	 * Set the Application to Fullscreen mode.
	 * 
	 * This is the one of the Core Methods which delivers the environment to implement a Game.
	 */
	public void init() {
		screen = new ScreenManager();
		DisplayMode dm = screen.findFirstCompatibleMode(modes);
		screen.setFullScreen(dm);

		Window w = screen.getFullScreenWindow();
		w.setFont(new Font("Arial", Font.PLAIN, 20));
		w.setBackground(Color.GREEN);
		w.setForeground(Color.WHITE);
		running = true;
	}

	/**
	 * Main GameLoop
	 * 
	 * @return
	 */
	public void gameLoop() {
		long startTime = System.currentTimeMillis();
		long cumTime = startTime;

		while (running) {
			long timePassed = System.currentTimeMillis() - cumTime;
			cumTime += timePassed;

			update(timePassed);

			Graphics2D g = screen.getGraphics();
			draw(g);
			g.dispose();
			screen.update();

			try {
				Thread.sleep(20);
			} catch (Exception ex) {
			}

		}
	}

	/**
	 * Update Animation
	 * 
	 * @param g
	 */
	public void update(long timePassed) {
		// Empty Body

	}

	/**
	 * Draw to screen
	 * 
	 * @param g
	 */
	public void draw(Graphics2D g) {
		// Empty Body

	}

}
