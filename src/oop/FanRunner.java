package oop;

import java.math.BigDecimal;

public class FanRunner {

	public static void main(String[] args) {
		Fan fab = new Fan("Hunter", 12.5, "Brushed Nickle",
				new BigDecimal("84.99"));
		System.out.println(fab.toString());
		System.out.println(fab.toString(true));
		fab.turnOn();
		fab.increaseSpeed();
		fab.increaseSpeed();
		System.out.println(fab.toString(true));
		fab.turnOff();
		System.out.println(fab.toString(true));
		fab.turnOn();
		System.out.println(fab.toString(true));
		fab.decreaseSpeed();
		fab.turnOff();
		System.out.println(fab.toString(true));
	}

}
