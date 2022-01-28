package com.alexpavlyuk.types;

import com.alexpavlyuk.HeavenlyBody;

public class Moon extends HeavenlyBody {
	public Moon(String name, double orbitalPeriod) {
		super(name, orbitalPeriod, BodyTypes.MOON);
	}
}
