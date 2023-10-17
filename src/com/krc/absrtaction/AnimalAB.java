package com.krc.absrtaction;

public abstract class AnimalAB {
	private String name;

	AnimalAB(String name) {
		this.name = name;
	};

	public String getName() {
		return name;
	}

	public abstract void speak();
}
