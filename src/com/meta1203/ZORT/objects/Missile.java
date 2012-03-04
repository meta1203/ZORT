package com.meta1203.ZORT.objects;

import org.lwjgl.opengl.GL11;

import com.meta1203.ZORT.util.Coord;

public class Missile extends Object {
	private int damage = 1;
	private int[] color = {255, 255, 255};
	
	public Missile(int damage, int[] color) {
		this.damage = damage;
		this.color = color;
	}
	
	public void move(float x, float y) {
		c1.x += x;
		c2.x += x;
		c1.y += y;
		c2.y += y;
	}
	
	public void move(Coord to) {
		c1.x += to.x;
		c2.x += to.x;
		c1.y += to.y;
		c2.y += to.y;
	}
	
	public Coord moveToVect(Object obj, int power) {
		return new Coord(obj.getMidPoint().x-this.getMidPoint().x, obj.getMidPoint().y-this.getMidPoint().y);
	}
	
	public void draw() {
		GL11.glColor3f(color[0]/256f, color[1]/256f, color[2]/256f);
		GL11.glBegin(GL11.GL_QUADS);
		    GL11.glVertex2f(c1.x,c1.y);
		    GL11.glVertex2f(c1.x,c2.y);
		    GL11.glVertex2f(c2.x,c2.y);
		    GL11.glVertex2f(c2.x,c1.y);
		GL11.glEnd();
	}
}
