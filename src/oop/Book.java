package oop;

public class Book {
	private int copiesSold = 0;
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopiesSold() {
		return copiesSold;
	}

	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}

	public Book(String title) {
		setTitle(title);
	}
}
