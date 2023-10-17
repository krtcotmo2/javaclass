package com.krc.interfaces;

public class MultipleInterfaceUsageFromAB
extends MultipleInterfaceUsageAB {

	// Must implement method from MultipleInterface1
	@Override
	public String method1() {
		// the super allows you to keep the values in the abstract or you can overwrite
		return super.method1();
		// return "overwritten class";
	}

	@Override
	public void method2() {
	}


}
