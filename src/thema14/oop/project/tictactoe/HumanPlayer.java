package thema14.oop.project.tictactoe;

import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {

	private Scanner scanner = new Scanner(System.in);
	
	public HumanPlayer(String name, Symbol symbol) {
		super(name, symbol);
	}

	@Override
	public boolean isHuman() {
		return true;
	}

	@Override
	public void makeMove(Board board) {
		System.out.println(name + ", gib deine Bewegung ein (Reihen Spalte):");
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		
		while(!board.makeMove(row, col, symbol)) {
			System.out.println("Ungültiger Zug. Versuch es erneut:");
			row = scanner.nextInt();
			col = scanner.nextInt();
		}
	}		
}
