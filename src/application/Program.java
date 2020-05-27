package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessmat= new ChessMatch();
		UI.printBoard(chessmat.getPieces());

	}

}
