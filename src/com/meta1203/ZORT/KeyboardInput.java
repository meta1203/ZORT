package com.meta1203.ZORT;

import org.lwjgl.input.Keyboard;

public class KeyboardInput {
	public static Direction getKeyDirection() {
		if (Keyboard.isKeyDown(Keyboard.KEY_W) && Keyboard.isKeyDown(Keyboard.KEY_A)) {
			return Direction.NORTH_WEST;
		}
		else if (Keyboard.isKeyDown(Keyboard.KEY_W) && Keyboard.isKeyDown(Keyboard.KEY_D)) {
			return Direction.NORTH_EAST;
		}
		else if (Keyboard.isKeyDown(Keyboard.KEY_S) && Keyboard.isKeyDown(Keyboard.KEY_A)) {
			return Direction.SOUTH_WEST;
		}
		else if (Keyboard.isKeyDown(Keyboard.KEY_S) && Keyboard.isKeyDown(Keyboard.KEY_D)) {
			return Direction.SOUTH_EAST;
		}
		else if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
			return Direction.NORTH;
		}
		else if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
			return Direction.WEST;
		}
		else if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
			return Direction.SOUTH;
		}
		else if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
			return Direction.EAST;
		}
		else {
			return null;
		}
	}
}
