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
	    Scanner sc = new Scanner(System.in);
		intro();
		runGame(sc);
	}
	
	public static void runGame(Scanner sc) {
		boolean xwin = false;
		boolean owin = false;
		int turn = -1; //Initilized as player 1's turn (1 indicates player 2's turn)
		while(xwin == false && owin == false) {
			if(turn == -1) {
				System.out.println("Player One, your turn.");
			} else {
				System.out.println("Player Two, your turn.");
			}
			System.out.println("Please choose a space.");
			boolean valid = false;
			while(valid == false) {
				int move = sc.nextInt();
				if(board[move - 1] == 0) {//Check if the space is filled
					valid = true;
					board[move - 1] = turn;
					turn = turn * -1;
				} else {
					System.out.println("Space " + move + " is already taken. Choose another.");
				}
				printBoard();
				int result = checkWin();
				if(result == -1) {
					System.out.println("Player 1 wins!!");
					xwin = true;
				}else if(result == 1){
					System.out.println("Player 2 Wins!!");
					owin = true;
				}
			}
		}
	}
	
	public static int checkWin() {
		for(int i = 0; i < 3; i++) {
			if((board[i * 3] + board[i * 3 + 1] + board[i * 3 + 2] == 3) ||
					board[i] + board[i + 3] + board[i + 6] == 3) {
				return 1;
			} else if(board[i * 3] + board[i * 3 + 1] + board[i * 3 + 2] == -3 ||
					board[i] + board[i + 3] + board[i + 6] == -3) {
				return -1;
			}
		}
		if(board[0] + board[4] + board[8]  == 3 || board[2] + board[4] + board[6] == 3) {
			return 1;
		} else if(board[0] + board[4] + board[8]  == -3 || board[2] + board[4] + board[6] == -3) {
			return -1;
		}
		return 0;
	}
	
	public static void intro() {
		System.out.println("Hello, let's play some tic tac toe.");
		System.out.println();
		System.out.println("Please choose a quadrant");
		printBoard();
	}
	
	public static void printBoard() {
		System.out.println(board[0] + " " + board[1] + " " + board[2]);
		System.out.println(board[3] + " " + board[4] + " " + board[5]);
		System.out.println(board[6] + " " + board[7] + " " + board[8]);
	}
	
}
