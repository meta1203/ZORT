package com.meta1203.ZORT.objects;

import org.lwjgl.opengl.GL11;

import com.meta1203.ZORT.util.Coord;
import com.meta1203.ZORT.util.Drawable;

public abstract class Object implements Drawable{
	boolean passable = false;
	boolean alive = false;
	
	Coord c1 = new Coord();
	Coord c2 = new Coord(1,1);
	
	public boolean checkCollision(Coord test) {
		if (((test.y >= c1.y) && (test.y <= c2.y)) && ((test.x >= c1.x) && (test.x <= c2.x))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Coord getMidPoint() {
		return new Coord((c1.x+c2.x)/2, (c1.y+c2.y)/2);
	}
	
	public double getDistance(Coord obj2MidPoint) {
		return Math.sqrt(Math.pow(obj2MidPoint.x - this.getMidPoint().x,2) + Math.pow(obj2MidPoint.y - this.getMidPoint().y,2));
	}
	
	public void draw() {
		GL11.glColor3f(0.5f,0.5f,1.0f);
		GL11.glBegin(GL11.GL_QUADS);
		    GL11.glVertex2f(c1.x,c1.y);
		    GL11.glVertex2f(c1.x,c2.y);
		    GL11.glVertex2f(c2.x,c2.y);
		    GL11.glVertex2f(c2.x,c1.y);
		GL11.glEnd();
	}
}
