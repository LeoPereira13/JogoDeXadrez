package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardGame.Board;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}

}
