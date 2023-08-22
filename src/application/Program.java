package application;

import chess.ChessMacht;

public class Program {

	public static void main(String[] args) {
		ChessMacht chessMacht = new ChessMacht();
		UI.printBoard(chessMacht.getPieces());

	}

}
