package oop;

public class LetterRunner {
	public static void main(String[] args) {
		Letter letter1 = new Letter('d');
		System.out.println(letter1.isVowel());
		System.out.println(letter1.isConsonant());
		System.out.println("------------------------");
		letter1.setLetter('e');
		System.out.println("v " + letter1.isVowel());
		System.out.println("c " + letter1.isConsonant());
		System.out.println("a " + letter1.isAlphabet());
		System.out.println("# " + letter1.isNumber());
		System.out.println("------------------------");
		letter1.setLetter('3');
		System.out.println("v " + letter1.isVowel());
		System.out.println("c " + letter1.isConsonant());
		System.out.println("a " + letter1.isAlphabet());
		System.out.println("# " + letter1.isNumber());
		System.out.println("------------------------");
		letter1.setLetter('F');
		System.out.println("v " + letter1.isVowel());
		System.out.println("c " + letter1.isConsonant());
		System.out.println("a " + letter1.isAlphabet());
		System.out.println("# " + letter1.isNumber());

		System.out.println("------------------------");
		Letter.printLowerCase();
		System.out.println("------------------------");
		Letter.printUpperCase();
	}
}
