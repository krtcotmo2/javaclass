package com.krc.absrtaction;

public class AnimalRuner {

	public static void main(String[] args) {
		Cat walle = new Cat("Wall-e");
		Dog spice = new Dog("Spice");

		walle.speak();
		spice.speak();

		BeerBraisedBrauts dinner = new BeerBraisedBrauts();
		GrilledCheese lunch = new GrilledCheese();
		lunch.execute();
		dinner.execute();
	}

}
