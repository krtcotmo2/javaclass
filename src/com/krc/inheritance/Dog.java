package com.krc.inheritance;

public class Dog extends Animal {
	private String name;

	Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	void sayOther() {
		System.out.println("A dog called " + this.name);
	}
}
