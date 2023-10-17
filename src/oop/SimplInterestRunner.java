package oop;

import java.math.BigDecimal;

public class SimplInterestRunner {

	public static void main(String[] args) {
		SimpleInterestCalc calc = new SimpleInterestCalc("4500", "7.5");
		BigDecimal totalValue = calc.calculateTotal(5);
		System.out.println(totalValue);

	}

}
