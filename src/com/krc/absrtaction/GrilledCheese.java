package com.krc.absrtaction;

public class GrilledCheese extends ReceipeAB {

	@Override
	void getReady() {
		System.out.println("get cheese");
		System.out.println("get bread");
		System.out.println("get butter");
	}

	@Override
	void doDish() {
		System.out.println("butter bread");
		System.out.println("grill sandwhich");
	}

	@Override
	void cleanup() {
		System.out.println("clean pan");
		System.out.println("get plate");
	}

}
