package com.krc.inheritance;

public class Pet extends Dog {
	Pet(String n) {
		super(n);
	}
	void speak() {
		System.out.println(getName() + " says Woof");
	}
}
