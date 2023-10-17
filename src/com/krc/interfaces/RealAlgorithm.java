package com.krc.interfaces;

public class RealAlgorithm implements ComplexAlgorithm {
	int number3;

	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}
	@Override
	public int complexAlgorithm(int num1, int num2) {
		/*
		 * in this demo we assume that this is the official algorithm.
		 */
		return num2 / num1;
	}

}
