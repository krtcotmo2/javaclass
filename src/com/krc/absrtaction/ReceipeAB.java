package com.krc.absrtaction;

public abstract class ReceipeAB {
	public void execute() {
		getReady();
		doDish();
		cleanup();
	}

	abstract void getReady();

	abstract void doDish();

	abstract void cleanup();

}
