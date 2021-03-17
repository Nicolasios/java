package Chess.Game;

import Chess.Member.Pawn;
import Chess.Ui.ChessBoard;
import Chess.Varible.Camp;
import Chess.Varible.Pair;
import Chess.Varible.Varible;

public class Game {
	void InitBoard() {};
	public static void main(String[] args) {
		Pawn pawn_1 = new Pawn(Varible.PAWN, new Pair(10, 0), Camp.BLACK);
		System.out.println(pawn_1.position.x);
		ChessBoard chessBoard = new ChessBoard();
		chessBoard.initui();
	}
}
