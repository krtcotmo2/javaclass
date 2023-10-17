package com.krc.interfaces;

public class TempAlgorithm implements ComplexAlgorithm {

	@Override
	public int complexAlgorithm(int num1, int num2) {
		/*
		 * in this demo we assume that we are waiting on a team to develop the real
		 * algorithm We can create temp method using the interface until the official
		 * algorithm is completed.
		 */
		return num1 + num2;
	}

}
