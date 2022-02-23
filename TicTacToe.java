package com.bridgelabz;

public class TicTacToe {
	public static char[] board = new char [10];
	public static void boardOfGame() {
		for (int index=1; index<board.length; index++) {


			board[index]=' ';
			System.out.println(board);
		}

	}
}


