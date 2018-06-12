//Zach Thomas
//This class defines an individual neuron for the tic tac toe neural network.

public class TicTacToeNeuron {
	
	public int bias;
	
	public TicTacToeBoard() {
		bias = 0;
	}
	
	public int giveOutput(int[] x, int[] w) {
		int result = 0;
		for(int i = 0; i < x.length; i++) {
			result += x[i] * w[i];
		}
		return result + bias;
	}
}
