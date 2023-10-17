package com.krc.interfaces;

public interface ComplexAlgorithm {
	default void setNumber3(int i) {
	}

	default int getNumber3() {
		return 0;
	}
	int complexAlgorithm(int num1, int num2);
}
