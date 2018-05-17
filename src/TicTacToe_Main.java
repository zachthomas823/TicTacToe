//Zach Thomas
//May 16, 2018
//This class will allow a user to play a game of tic tac toe against a computer that will make random moves

import java.io.*;
public class TicTacToe_Main {

	public static void main(String[] args) {
		intro();
	}
	
	public static void intro() {
		System.out.println("Hello, let's play some tic tac toe.");
		System.out.println();
		System.out.println("Please choose a quadrant");
		emptyColumn();
		System.out.println(" Q1 | Q2 | Q3");
		System.out.println("____|____|___");
		emptyColumn();
		System.out.println(" Q4 | Q5 | Q6");
		System.out.println("____|____|___");
		emptyColumn();
		System.out.println(" Q7 | Q8 | Q9");
		emptyColumn();
	}
	
	private static void emptyColumn() {
		System.out.println("    |    |");
	}
}
