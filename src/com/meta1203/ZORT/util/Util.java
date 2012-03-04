package com.meta1203.ZORT.util;

import java.util.Random;

import com.meta1203.ZORT.Direction;

public class Util {
	public static final Random rand = new Random();
	
	public static Coord getMoveVector(Direction dir, int power) {
		
		
		if (dir == Direction.NORTH) {
			return new Coord(0,power);
		}
		else if (dir == Direction.SOUTH) {
			return new Coord(0,-power);
		}
		else if (dir == Direction.EAST) {
			return new Coord(power,0);
		}
		else if (dir == Direction.WEST) {
			return new Coord(-power,0);
		}
		else if (dir == Direction.NORTH_WEST) {
			return new Coord(-power,power);
		}
		else if (dir == Direction.NORTH_EAST) {
			return new Coord(power,power);
		}
		else if (dir == Direction.SOUTH_WEST) {
			return new Coord(-power,-power);
		}
		else {
			return new Coord(power,-power);
		}
	}
}
