package oop;

import java.math.BigDecimal;

public class SimpleInterestCalc {
	private BigDecimal principal;
	private BigDecimal interestRate;

	public SimpleInterestCalc(String string, String string2) {
		this.principal = new BigDecimal(string);
		this.interestRate = new BigDecimal(string2)
				.divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotal(int i) {
		BigDecimal years = new BigDecimal(i);
		return this.principal
				.add(
						this.principal.multiply(this.interestRate).multiply(years));
	}

}
