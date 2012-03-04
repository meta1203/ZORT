package com.meta1203.ZORT.objects;

import com.meta1203.ZORT.util.Coord;

public class Player extends LivingObject {
	public int healthRegen;
	
	public Player(Coord pos) {
		c1 = new Coord(pos.x-10,pos.y-10);
		c2 = new Coord(pos.x+10,pos.y+10);
		healthRegen = 5;
		maxHealth = 100;
		health = 90;
	}
	
	@Override
	public void kill() {
		System.exit(0);
	}

	@Override
	public void regenHealth() {
		if (health < maxHealth) {
			health += healthRegen;
		}
		if (health > maxHealth) {
			health = maxHealth;
		}
	}

	@Override
	public void attack() {
		
	}
}
