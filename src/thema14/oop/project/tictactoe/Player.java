package thema14.oop.project.tictactoe;

public interface Player {

	Symbol getSymbol();			// Gibt das Symbol des Spielers zurück
	void makeMove(Board board); // Führt einen Spielzug aus
	boolean isHuman();
}
