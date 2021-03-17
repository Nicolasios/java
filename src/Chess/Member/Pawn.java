package Chess.Member;

import Chess.Varible.Camp;
import Chess.Varible.Pair;
import Chess.Varible.Varible;

public class Pawn extends Chess {

	public Pawn(Varible size, Pair position,Camp camp) {
		super(size, position, camp);
		// TODO Auto-generated constructor stub
	}
	int canMove(Pair destination) {
		Pair temPos = this.position;
		return 1;
	}
}
