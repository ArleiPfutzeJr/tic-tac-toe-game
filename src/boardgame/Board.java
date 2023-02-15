package boardgame;

public class Board {

	private int rows;
	private int columns;

	private X_or_O[][] x_or_O;

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		x_or_O = new X_or_O[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}




}