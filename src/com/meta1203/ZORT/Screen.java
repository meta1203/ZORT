package com.meta1203.ZORT;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import com.meta1203.ZORT.objects.World;
import com.meta1203.ZORT.util.Coord;
import com.meta1203.ZORT.util.Drawable;
import com.meta1203.ZORT.util.Util;

public class Screen extends Thread{
	public void run() {
		try {
			Display.setDisplayMode(new DisplayMode(800,600));
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		// init OpenGL here
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, 800, 0, 600, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		
		while (!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
			
			Direction dir;
			if ((dir = KeyboardInput.getKeyDirection()) != null) {
				Coord c = Util.getMoveVector(dir, 1);
				Main.p.move(c.x, c.y);
			}
			
			
			
			for (Drawable d : World.drawables) {
				d.draw();
			}
			
			Display.update();
		}
		
		Display.destroy();
		System.exit(0);
	}
}
