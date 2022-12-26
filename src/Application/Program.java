package Application;

import Chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
	
		ChessMatch chessMatch = new ChessMatch();
		uI.printBoard(chessMatch.getPieces());
	}

}
