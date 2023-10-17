package com.krc.absrtaction;

public class Cat extends AnimalAB {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println(getName() + " says ME-WOW");
	}
}
