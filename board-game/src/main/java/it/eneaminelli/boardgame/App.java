package it.eneaminelli.boardgame;

import it.eneaminelli.boardgame.managers.BoardManager;
import it.eneaminelli.boardgame.units.BaseUnit;
import it.eneaminelli.boardgame.units.RangedUnit;

public class App {
    public static void main(String[] args) {
        BoardManager boardManager = new BoardManager();
        System.out.println("This is the gameboard: " + boardManager.getGameBoard().printBoard());
        BaseUnit testUnit = boardManager.spawnUnit(new RangedUnit());
        System.out.println("Unit name is " + testUnit.getUnitName() + " and is in coordinates:\nx: " + testUnit.getPosition().getPosX() + "\ny: " + testUnit.getPosition().getPosY());
        ;
        
    }
}
