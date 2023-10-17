package com.krc.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		GameConsole game = new MarioGame();
		game.right();
		game.right();
		game.right();
		game.up();

		GameConsole chess = new ChessGame();
		chess.right();
		chess.right();
		chess.up();
	}

}
