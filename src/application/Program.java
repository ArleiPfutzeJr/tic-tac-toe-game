package application;

import boardgame.Position;
import boardgame.Board;

public class Program {

	public static void main(String[] args) {
		Position pos = new Position(0, 1);
		System.out.println(pos);

		Board board = new Board(3, 3);
	}

}