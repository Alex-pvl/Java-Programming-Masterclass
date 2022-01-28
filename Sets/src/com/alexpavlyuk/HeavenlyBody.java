package com.alexpavlyuk;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
	private final Key key;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;

	public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
		this.key = new Key(name, bodyType);
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
	}

	public Key getKey() {
		return key;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}

	public boolean addSatellite(HeavenlyBody satellite) {
		return this.satellites.add(satellite);
	}

	public static Key makeKey(String name, BodyTypes bodyType) {
		return new Key(name, bodyType);
	}

	@Override
	public String toString() {
		return this.key + ", " + this.orbitalPeriod;
	}

	@Override
	public final boolean equals(Object obj) {
		if(this == obj) return true;
		if (!(obj instanceof HeavenlyBody)) return false;
		HeavenlyBody that = (HeavenlyBody) obj;
		return this.key.equals(that.key);
	}

	@Override
	public final int hashCode() {
		System.out.println("hashcode called");
		return this.key.hashCode();
	}

	public enum BodyTypes {
		PLANET,
		DWARF_PLANET,
		MOON
	}

	public static final class Key {
		private final String name;
		private BodyTypes bodyType;

		private Key(String name, BodyTypes bodyType) {
			this.name = name;
			this.bodyType = bodyType;
		}

		public String getName() {
			return name;
		}

		public BodyTypes getBodyType() {
			return bodyType;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) return true;
			if (!(obj instanceof Key)) return false;
			Key that = (Key) obj;
			return this.name.equals(that.name) && this.bodyType.equals(that.bodyType);
		}

		@Override
		public int hashCode() {
			return this.name.hashCode() + this.bodyType.hashCode() + 57;
		}

		@Override
		public String toString() {
			return this.name + ": " + this.bodyType;
		}
	}
}
