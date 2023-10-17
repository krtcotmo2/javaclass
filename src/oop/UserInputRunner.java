package oop;

import java.util.Scanner;

public class UserInputRunner {

	public static void main(String[] args) {
		NumberGatherer.numberTree(5);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter in number 1");
		int number1 = scanner.nextInt();
		System.out.println("Enter in number 2");
		int number2 = scanner.nextInt();
		System.out.println("Choose opperation");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Multiply");
		System.out.println("4 - Divide");
		int opperation = scanner.nextInt();

		try {
			double val = NumberGatherer.makeCalculation(number1, number2,
					opperation);
			System.out.println("Results = " + val);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		scanner.close();
	}

}
