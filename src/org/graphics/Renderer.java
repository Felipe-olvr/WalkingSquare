package org.graphics;
import org.input.KeyInput;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;

public class Renderer {
	private static GLWindow window = null;
	
	public static int screenWidth = 400;
	public static int screenHeight = 400;
	
	public static float unitsWide = 30.0f;
	
	public int xpos = 0;
	public int ypos = 0;
	
	public static void init() {
		
		// Getting the capabilities object of GL2 profile
		GLProfile.initSingleton();
		final GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities capabilities = new GLCapabilities(profile);
		
		window = GLWindow.create(capabilities);
		window.setSize(screenWidth, screenHeight);
		window.setResizable(false);
		
		window.addGLEventListener(new Rectangle());
		window.addKeyListener(new KeyInput());
		
		window.setTitle("Walking Square Game");
		
		window.setVisible(true);
		
	}
	
	public static void render() {
		if (window == null) {
			return;
		}
		
		window.display();
	}
	
	
	public static int getScreenWidth() {
		return window.getWidth();
	}
	
	
	public static int getScreenHeight() {
		return window.getHeight();
	}
	
}
