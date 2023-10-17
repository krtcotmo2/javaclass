package com.krc.interfaces;

import com.krc.absrtaction.AnimalAB;
import com.krc.absrtaction.Cat;
import com.krc.absrtaction.Dog;

public class FlyerRunner {
	public static void main(String[] args) {

		Flyable[] objs = { new Bird(), new Plane() };

		for (Flyable o : objs) {
			o.fly();
		}

		AnimalAB[] pets = new AnimalAB[] { new Cat("Eva"),
				new Dog("Scooter") };

		for (AnimalAB p : pets) {
			p.speak();
		}
	}
}
