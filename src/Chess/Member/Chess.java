package Chess.Member;

import Chess.Varible.*;

public class Chess {
	public int flag = 1; // on the board or not
	public Varible size = Varible.CANNON; // the identity of each chess ,and the initial is CANNAN
	public Pair position = new Pair(0, 0);//the position of each chess
	public Camp camp;//the camp of each chess black or red

	Chess(Varible size, Pair position,Camp camp) {
		this.flag = 1;
		this.size = size;
		this.position = position;
		this.camp = camp;
	}
}
