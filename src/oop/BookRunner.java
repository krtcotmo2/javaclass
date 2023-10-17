package oop;

public class BookRunner {

	public static void main(String[] args) {
		Book patterns = new Book("Design Patterns for Programming");
		Book java = new Book("Java 8 Cookbook");
		Book cleanCode = new Book("Clean Code");

		patterns.setCopiesSold(290);
		java.setCopiesSold(800);
		cleanCode.setCopiesSold(7790);

		System.out.println(patterns.getTitle());
	}
}
