package oop;

public class BiNumbersRunner {

	public static void main(String[] args) {
		BiNumbers numSet = new BiNumbers(62, 17);

		System.out.println(numSet.add());
		System.out.println(numSet.multiply());
		numSet.doubleValues();
		System.out.println(numSet.getNum1());
		System.out.println(numSet.getNum2());
		numSet.createRandom(1);
		System.out.println(numSet.getNum1());
		System.out.println(numSet.getNum2());
		numSet.createRandom(2);
		System.out.println(numSet.getNum1());
		System.out.println(numSet.getNum2());
	}
}
