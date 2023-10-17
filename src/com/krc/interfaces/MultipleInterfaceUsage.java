package com.krc.interfaces;

public class MultipleInterfaceUsage implements MultipleInterface2 {

	// Must implement method from MultipleInterface1
	@Override
	public String method1() {
		return "something";

	}

	// Must implement method from MultipleInterface2
	@Override
	public void method2() {
	}

}
