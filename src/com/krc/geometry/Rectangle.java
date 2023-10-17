package com.krc.geometry;

public class Rectangle {

	// STATE
	private int length;
	private int width;
	private boolean isSquare;

	// CONSTRUCTIOR
	Rectangle(int length, int width) {
		this.length = Math.max(length, width);
		this.width = Math.min(length, width);
		isSquare = this.width == this.length;
	}

	// METHODS
	int area() {
		return width * length;
	}

	int permieter() {
		return 2 * (length + width);
	}

	@Override
	public
	String toString() {
		return String.format("%s L: %d W: %d",
				isSquare ? "Square" : "Rectangle",
						length, width);
	}

}
