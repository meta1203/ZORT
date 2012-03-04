package com.meta1203.ZORT.objects;

import java.util.ArrayList;
import java.util.List;

import com.meta1203.ZORT.util.Drawable;

public class World {
	public static List<Object> objects = new ArrayList<Object>();
	public static List<Drawable> drawables = new ArrayList<Drawable>();
	
	public static void addObject(Object obj) {
		objects.add(obj);
		drawables.add(obj);
	}
}
