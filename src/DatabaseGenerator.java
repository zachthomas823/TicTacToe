//Zach Thomas
//This class will create a database of all possible combinations of tic tac toe and label them with the result.

import java.io.*;
import java.util.Arrays;

public class DatabaseGenerator {

	public static void main(String[] args) {
		DatabaseGeneratorNode[] roots = new DatabaseGeneratorNode[9];
		for(int i = 0; i < 9; i++) {
			int[] board = new int[9];
			board[i] = -1;
			DatabaseGeneratorNode root = new DatabaseGeneratorNode(board);
			root = makeTree(root, 8);
			roots[i] = root;
		}
	}
	
	public static DatabaseGeneratorNode makeTree(DatabaseGeneratorNode input, int spaces) {
		if(!checkWin(input, spaces)) {
			for(int i = 9 - spaces; i < 9; i++) {
				int[] temp = input.board;
				if(spaces % 2 == 0) {
					temp[i] = 1;
				}else {
					temp[i] = -1;
				}
				input.leaves[i + spaces - 9] = new DatabaseGeneratorNode(temp);
			}	
		}
		try {
			FileWriter writer = new FileWriter("TicTacToeDatabase.txt");
			for(int i = 0; i < 9; i++) {
				writer.write("hello world.");
				writer.write(input.board[i]);
			}
			writer.write(" ");
			writer.write(input.result);
			writer.write("\r\n");
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return input;
	}
	
	//Takes a DatabaseGeneratorNode as an input. Returns true if the game has been won, false if the game is not over.
	public static boolean checkWin(DatabaseGeneratorNode input, int spaces) {
		boolean result;
		if(input.board[0] == input.board[1] && input.board[1] == input.board[2] ||
				input.board[3] == input.board[4] && input.board[4] == input.board[5] ||
				input.board[6] == input.board[7] && input.board[7] == input.board[8] ||
				input.board[0] == input.board[3] && input.board[3] == input.board[6] ||
				input.board[1] == input.board[4] && input.board[4] == input.board[7] ||
				input.board[2] == input.board[5] && input.board[5] == input.board[8] ||
				input.board[0] == input.board[4] && input.board[4] == input.board[8] ||
				input.board[2] == input.board[4] && input.board[4] == input.board[6]) {
			if(spaces % 2 == 0) {
				input.result = 1;
			}else {
				input.result = -1;
			}
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
	public static void xMove(int[] tempBoard) {
		for(int i = 0; i < 9; i++) {
			if(tempBoard[i] == 0) {
				
			}
		}
	}
}
