package oop;

import java.util.Arrays;
import java.util.List;

public class Letter {
	private Character letter;
	private Character[] vowels = new Character[] { 'a', 'e', 'i', 'o',
			'u', 'A', 'E', 'I', 'O', 'U' };
	List<Character> vowelsList = Arrays.asList(vowels);
	Letter(Character c) {
		this.letter = c;
	}

	void setLetter(Character c) {
		this.letter = c;
	}
	boolean isVowel() {
		return this.vowelsList.contains(this.letter);
	}

	boolean isConsonant() {
		return !isVowel() && this.isAlphabet();
	}

	boolean isNumber() {
		return this.letter >= 48 && this.letter <= 57;
	}

	boolean isAlphabet() {
		return (this.letter >= 65 && this.letter <= 90)
				|| (this.letter >= 97 && this.letter <= 122);
	}

	static void printLowerCase() {
		//		for (int i = 97; i <= 122; i++) {
		//			Character c = Character.valueOf((char) i);
		//			System.out.println(c);
		//		}
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
		}
	}

	static void printUpperCase() {
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
		}
	}

}
