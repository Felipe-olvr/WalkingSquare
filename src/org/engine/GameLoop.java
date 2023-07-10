package org.engine;

import org.graphics.Renderer;

public class GameLoop {
	private static boolean running = false;
	
	public static void start() {
		Thread thread = new Thread() {
			public void run() {
				running = true;
				
				while(running) {
					Renderer.render();
				}
			}
		};
		thread.setName("GameLoop");
		thread.start();
	}
}
