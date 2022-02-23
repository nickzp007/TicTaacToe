package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe_UC2 {
	public static char[] board = new char [10];
	static char playerChoose;
	static char compChoose;
	public static void boardOfGame() {
		for (int index=1; index<board.length; index++) {


			board[index]=' ';
			System.out.println(board);
		}


	}

	public static void chooseSymbol() {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your Choose Symbol X or O");

		char symbol=sc.next().charAt(0);
		sc.close();

		if(symbol=='X'||symbol=='x') {
			playerChoose='X';
			compChoose='O';		
		}
		else if(symbol=='O'||symbol=='o'){
			playerChoose='O';
			compChoose='X';
		}
		else{
			System.out.println("Invalid Input");
		}

	}

}


