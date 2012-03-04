package com.meta1203.ZORT;

import com.meta1203.ZORT.objects.Player;
import com.meta1203.ZORT.objects.World;
import com.meta1203.ZORT.util.Coord;

public class Main {
	private Screen screen;
	static Player p = new Player(new Coord(100,100));
	
	private Main() {
		screen = new Screen();
		screen.start();
		World.addObject(p);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
