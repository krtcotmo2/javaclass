package oop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	String name = "";
	ArrayList<Integer> grades = new ArrayList<Integer>();

	Student(String name, int... scores) {
		this.name = name;
		for (int score : scores) {
			this.grades.add(score);
		}
	}

	BigDecimal getAverage() {
		BigDecimal total = new BigDecimal(getGradeTotal());
		BigDecimal divisor = new BigDecimal(getNumberOfGrades());
		return total.divide(divisor, 3, RoundingMode.UP);
	}

	int getGradeTotal() {
		int total = 0;
		for (int grade : grades) {
			total += grade;
		}
		return total;
	}

	int getNumberOfGrades() {
		return this.grades.size();
	}

	int getBestScore() {
		return Collections.max(this.grades);
		//		ArrayList<Integer> sorted = (ArrayList<Integer>) this.grades
		//				.clone();
		//		Collections.sort(sorted, Collections.reverseOrder());
		//		return sorted.get(0);
	}

	int getWorstScore() {
		return Collections.min(this.grades);
		//		ArrayList<Integer> sorted = (ArrayList<Integer>) this.grades
		//				.clone();
		//		Collections.sort(sorted);
		//		return sorted.get(0);
	}

	void addScore(int val) {
		this.grades.add(val);
	}

	void removeScoreAt(int index) {
		this.grades.remove(index);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(this.name);
		sb.append(" " + this.grades);
		return sb.toString();
	}
}
