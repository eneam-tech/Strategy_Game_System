package it.eneaminelli.boardgame.managers;

import java.util.ArrayList;
import java.util.List;

import it.eneaminelli.boardgame.board.Board;
import it.eneaminelli.boardgame.board.Cell;
import it.eneaminelli.boardgame.units.BaseUnit;

public class BoardManager {
    private Board gameBoard;
    private List<Cell> freeCells = new ArrayList<Cell>();

    //TODO: add personalization for board creation
    public BoardManager() {
        gameBoard = new Board("Test", 3, 3);
    }

    public List<Cell> findFreeCells(Board gameBoard){
        Cell[][] boardCells = gameBoard.getGameBoard();

        if(boardCells != null) {
            for (Cell[] boardCellX : boardCells) {
                for (Cell boardCellY : boardCellX) {
                    if(!boardCellY.isOccupied()) {
                        freeCells.add(boardCellY);
                    }
                }
            }
        } else {
            System.err.println("Error encountered. Board was not initialized.");
        }
        return freeCells;
    }

    public BaseUnit spawnUnit(BaseUnit unit){
        if(findFreeCells(gameBoard) != null){
            Cell spawnPoint = freeCells.getFirst();
            unit.setPosition(spawnPoint);
            return unit;
        } else {
            System.out.println("No free space to spawn unit.");
            return null;
        }
    }

    public Board getGameBoard() {
        return gameBoard;
    }

    

}
