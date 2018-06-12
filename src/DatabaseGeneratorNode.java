//Zach Thomas
//This class defines the node that will be used in the decision tree of the database of tic tac toe games

public class DatabaseGeneratorNode {

	public int[] board; //X = -1, O = 1, empty = 0
	public DatabaseGeneratorNode[] leaves;
	public int result; //Marked -1 if X has won, 1 if O has won, 0 for a cat's game and 10 if the game is not over
	
	public DatabaseGeneratorNode(int[] inputBoard) {
		board = inputBoard;
		leaves = new DatabaseGeneratorNode[8];
		result = 10;
	}
}
