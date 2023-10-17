package oop;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student john = new Student("John", 93, 85, 93, 98, 50, 94, 97);

		System.out.println(john.getAverage());
		System.out.println(john.getBestScore());
		System.out.println(john.getWorstScore());
		System.out.println(john);
		john.addScore(100);
		john.removeScoreAt(4);
		System.out.println(john.getAverage());
		System.out.println(john.getBestScore());
		System.out.println(john.getWorstScore());

		System.out.println(john);
	}

}
