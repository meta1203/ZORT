package com.meta1203.ZORT.objects;

import com.meta1203.ZORT.util.Coord;

public abstract class LivingObject extends Object {
	int maxHealth = 10;
	int health = 10;
	
	public abstract void kill();
	
	public void takeDamage(int damage) {
		health = health - damage;
		if (health <= 0) {
			kill();
		}
	}
	
	public abstract void regenHealth();
	
	public abstract void attack();
	
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
}
