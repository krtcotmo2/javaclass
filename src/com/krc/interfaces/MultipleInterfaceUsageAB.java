package com.krc.interfaces;

public abstract class MultipleInterfaceUsageAB
implements MultipleInterface2 {

	// When you make an implementation of multiple interfaces, you have the option
	// of implementing SOME of the methods
	@Override
	public String method1() {
		return "WTF is this for";
	};

}
