package com.krc.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {

	private String title;
	private String employer;
	private char employeeGrade;
	private BigDecimal salary;

	public String getTitle() {
		return title;
	}

	public String getEmployer() {
		return employer;
	}

	public char employeeGrade() {
		return employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	Employee(String name, String title, String employer,
			char employeeGrade,
			BigDecimal salary) {
		super(name);
		this.employer = employer;
		this.employeeGrade = employeeGrade;
		this.title = title;
		this.salary = salary;
	}

	@Override
	public
	String toString() {
		return "Employee [Title=" + title + ", " + "Employer=" + employer
				+ ", " + "Employee Grade=" + employeeGrade + ", " + "Salary=$"
				+ salary.toString() + "]\n" + super.toString();

	}

}
