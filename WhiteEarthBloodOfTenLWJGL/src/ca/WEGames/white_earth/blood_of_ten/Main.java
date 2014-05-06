/**
 * 
 */
package ca.WEGames.white_earth.blood_of_ten;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import ca.WEGames.white_earth.blood_of_ten.level.Level;

/**
 * @author Catman3304
 *
 */
public class Main implements Runnable{
	
	int width = 1080, height = width / 16 * 9;
	
	Thread thread;
	boolean running = false;
	
	Level level;
	
	/**
	 * 
	 */
	public Main() {
		level = new Level(5, 3, 5);
	}
	
	public synchronized void start() {
		try {
			Display.setDisplayMode(new DisplayMode(width, height));
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);	
			GL11.glColor4f(0.5f,0.5f,1.0f, 0.0f);
			
			
			GL11.glBegin(GL11.GL_QUADS);
				GL11.glVertex2f(0,0);
				GL11.glVertex2f(0,16);
				GL11.glVertex2f(16,0);
				GL11.glVertex2f(16,16);
			GL11.glEnd();

			Display.update();
		}
		Display.destroy();
	}
	
	void initOpenGL() {
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, width, 0, height, 0.5, 10000);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
	}
	
	public void run() {
		while(running) {
			
		}
	}
	
	public static void main(String[] arg0) {
		Main main = new Main();
		main.start();
	}
}
