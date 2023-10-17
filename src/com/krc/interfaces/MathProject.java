package com.krc.interfaces;

public class MathProject {
	public static void main(String[] args) {
		// when we do not have the final alg, we can use the temp one
		// it gets changes to implement the real algo when it is ready.
		// normally we switch it out here for demo we comment
		// ComplexAlgorithm alg = new TempAlgorithm();
		ComplexAlgorithm alg = new RealAlgorithm();
		System.out.println(alg.complexAlgorithm(10, 23));
		alg.setNumber3(5);
		System.out.println(alg.getNumber3());

		MultipleInterfaceUsageFromAB wtf = new MultipleInterfaceUsageFromAB();
		System.out.println(wtf.method1());

	}
}
