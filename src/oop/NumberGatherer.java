package oop;

public class NumberGatherer {
	public static double makeCalculation(int number1, int number2,
			int opperation) throws Exception {
		switch (opperation) {
			case 1:
				return number1 + number2;
			case 2:
				return number1 - number2;
			case 3:
				return number1 * number2;
			case 4:
				return (double) number1 / number2;
			default:
				throw new Exception("Invalid Entry");
		}
	}

	public static void numberTree(int num) {
		String s = "1";
		System.out.println(s);
		for (int i = 2; i <= num; i++) {
			s += " " + i;
			System.out.println(s);
		}

	}
}
