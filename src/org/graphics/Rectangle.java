package org.graphics;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

public class Rectangle implements GLEventListener {
	
	public static float x = 0;
	public static float y = 0;
	public static float xpos = 0;
	public static float ypos = 0;
	
	@Override
	public void display(GLAutoDrawable drawable) {
		final GL2 gl = drawable.getGL().getGL2();
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		
		int quadSize = 5;
		// Drawing a blue rectangle
		gl.glColor3f(0.5f, 0.5f, 0.5f);
		gl.glBegin(GL2.GL_QUADS);
		gl.glVertex2f(-quadSize, -quadSize);
		gl.glVertex2f(quadSize, -quadSize);
		gl.glVertex2f(quadSize, quadSize);
		gl.glVertex2f(-quadSize, quadSize);
		gl.glEnd();
		
		//x += 0.01f;
		gl.glTranslatef(x, y, 0);
		//gl.glRotatef(0.15f, 0, 1, 1);
		xpos += x;
		ypos += y;
				
	}
	
	@Override
	public void dispose(GLAutoDrawable arg0) {
		// body
	}
	
	@Override
	public void init(GLAutoDrawable drawable) {
		final GL2 gl = drawable.getGL().getGL2();
		
		gl.glClearColor(0,0,0,1);
				
	}
	
	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		final GL2 gl = drawable.getGL().getGL2();
		
		// display area to cover the entire window 
		gl.glViewport(0, 0, width, height); 
		
		gl.glMatrixMode(GL2.GL_PROJECTION); // to use matrix
		gl.glLoadIdentity();
		
		float unitsTall = Renderer.getScreenHeight() / (Renderer.getScreenWidth() / Renderer.unitsWide);
		
		gl.glOrtho(-Renderer.unitsWide / 2, Renderer.unitsWide / 2, -unitsTall / 2, unitsTall / 2, -1, 1); // using 2D
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		
	}
	
}
