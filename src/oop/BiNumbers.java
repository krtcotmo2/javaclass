package oop;

import java.util.ArrayList;
import java.util.List;

public class BiNumbers {

	int num1;
	int num2;

	// GETTER SETTER
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}

	// OVERLOADS
	BiNumbers() {
		this.num1 = 1;
		this.num2 = 1;
	}
	BiNumbers(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// METHODS
	public int add() {
		return this.num1 + this.num2;
	}
	public int multiply() {
		return this.num1 * this.num2;
	}
	public void doubleValues() {
		this.num1 = 2 * this.num1;
		this.num2 = 2 * this.num2;
	}

	public void createRandom(int position) {
		if (position == 1) {
			this.num1 = (int) (Math.random() * 20) + 1;
		} else {
			this.num2 = (int) (Math.random() * 20) + 1;
		}
		List<String> aList = new ArrayList<String>();
		aList.add("asdkasldk");
	}

}
