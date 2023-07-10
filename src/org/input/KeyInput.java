package org.input;

import org.graphics.Rectangle;

import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;

public class KeyInput implements KeyListener {
	public float m = 0.1f;

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Rectangle.x += m;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Rectangle.x -= m;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Rectangle.y += m;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Rectangle.y -= m;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		float rm = -m;
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Rectangle.x += rm;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Rectangle.x -= rm;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Rectangle.y += rm;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Rectangle.y -= rm;
		}
		
	}

}
