package application;

import java.util.Locale;
import java.util.Scanner;

import chess.ChessMatch;



public class Pogram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		
		
		sc.close();
	}

}
