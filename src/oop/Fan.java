package oop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fan {
	// STATE
	private String make;
	private double radius;
	private boolean isOn;
	private boolean i;
	private boolean hasLight;
	private BigDecimal price;
	private byte storedSpeed;
	private byte speed;
	private String color;

	// SETTERs AND GETTERS

	// CONSTRUCTOR
	Fan() {
		this("Unknown", 0, "Unknown", new BigDecimal("0"));
	}

	Fan(String make, double radius, String color, BigDecimal price) {
		this.make = make;
		this.radius = radius;
		this.color = color;
		this.price = price;
	}

	// METHODS
	void turnOn() {
		isOn = true;
		if (storedSpeed == 0) {
			storedSpeed = 1;
		}
		speed = storedSpeed;
	}

	void turnOff() {
		storedSpeed = speed;
		isOn = false;
		speed = 0;
	}

	void increaseSpeed() {
		if (speed <= 4) {
			speed++;
			storedSpeed = speed;
		}
	}

	void decreaseSpeed() {
		if (speed > 0) {
			speed--;
			storedSpeed = speed;
		}
	}
	@Override
	public String toString() {
		return String.format("%s R%f %s - $%.2f", this.make, this.radius,
				this.color, this.price.setScale(2, RoundingMode.HALF_UP));
	}

	public String toString(boolean includeDetails) {
		if (!includeDetails)
			return this.toString();
		return String.format(
				"%s R%f %s - %s Actual Speed: %s Stored Speed: %s", make,
				radius, color, isOn ? "On" : "Off", String.valueOf(speed),
						String.valueOf(storedSpeed));
	}

}
