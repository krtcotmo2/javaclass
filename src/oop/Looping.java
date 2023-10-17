package oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Looping {

	public static void getCubed() {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Enter a number: ");
			try {
				num = scanner.nextInt();
				System.out.println("val " + (num * num * num));
			} catch (InputMismatchException e) {
				System.out.println("Invalid value");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!Double.isNaN(num));
		System.out.println("Good Bye");
		scanner.close();


	}

}
