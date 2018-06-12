//Zach Thomas
//May 16, 2018
//This class will allow a user to play a game of tic tac toe against a computer that will make random moves

import java.io.*;
import java.util.*;
public class TicTacToe_Main {
	
	public static int[] board; //Represents the board read from left to right, top to bottom -1=X, 0=BLANK, 1=O
	public static int[] firstWeights;

	public static void main(String[] args) {
		board = new int[9];
		firstWeights = new int[9];
		System.out.println(Arrays.toString(board));
	    //Scanner sc = new Scanner(System.in);
		//intro();
	}
	
	public static void chooseMove() {
		 
	}
	
	public static void makeMove() {
		System.out.println("Please choose a quadrant");
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
