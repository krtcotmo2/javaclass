package com.krc.interfaces;

public class Plane implements Flyable {

	@Override
	public void fly() {
		System.out.println("With Fuel");
	}

}
