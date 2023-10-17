package com.krc.geometry;

public interface Shape {
	default int area() {
		return 0;
	}
}
