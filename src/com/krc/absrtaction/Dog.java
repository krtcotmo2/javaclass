package com.krc.absrtaction;

public class Dog extends AnimalAB {

	public Dog(String name) {
		super(name);
	}
	@Override
	public void speak() {
		System.out.println(getName() + " says woof");
	}
}
