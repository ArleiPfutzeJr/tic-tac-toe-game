package boardgame;

public class X_or_O {

	protected Position position;
	private Board board;

	public X_or_O(Board board) {
		this.board = board;
		
	}

	protected Board getBoard() {
		return board;
	}


}