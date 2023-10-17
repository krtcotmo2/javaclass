package com.krc.absrtaction;

public class BeerBraisedBrauts extends ReceipeAB {

	@Override
	void getReady() {
		System.out.println("get brats");
		System.out.println("get beer");
		System.out.println("get onions");

	}

	@Override
	void doDish() {
		System.out.println("cook brauts");
		System.out.println("saute onions");
	}

	@Override
	void cleanup() {
		System.out.println("clean pan");
		System.out.println("get plate");
	}

}
