package it.eneaminelli.boardgame;

import it.eneaminelli.boardgame.managers.BoardManager;

public class App {
    public static void main(String[] args) {
        BoardManager boardManager = new BoardManager();
        System.out.println("This is the gameboard: " + boardManager.getGameBoard().printBoard());
        boardManager.spawnUnit();
        boardManager.spawnUnit();
    }
}
