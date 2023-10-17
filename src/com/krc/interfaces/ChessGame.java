package com.krc.interfaces;

public class ChessGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("Highlight one square above of current square");
	}

	@Override
	public void down() {
		System.out.println("Highlight one square below of current square");
	}

	@Override
	public void left() {
		System.out.println("Highlight one square left of current square");
	}

	@Override
	public void right() {
		System.out.println("Highlight one square right of current square");
	}

}
