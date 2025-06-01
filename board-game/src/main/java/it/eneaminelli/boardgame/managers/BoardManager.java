package it.eneaminelli.boardgame.managers;

import java.util.ArrayList;
import java.util.List;

import it.eneaminelli.boardgame.board.Board;
import it.eneaminelli.boardgame.board.Cell;
import it.eneaminelli.boardgame.units.BaseUnit;
import it.eneaminelli.boardgame.units.RangedUnit;

/**
 * Manages the game board and unit spawning logic.
 * Responsible for initializing the board, tracking cell occupancy,
 * and placing units on available (unoccupied) cells.
 */
public class BoardManager {

    /** The game board instance managed by this class */
    private Board gameBoard;

    /** A flat list of all cells in the game board */
    private List<Cell> cellsList = new ArrayList<>();

    /**
     * Constructs the BoardManager and initializes a default board.
     * Currently hardcoded to a 3x3 board named "Test".
     * Cells are extracted and stored in a flat list.
     */
    public BoardManager() {
        //TODO: Add personalized board creation
        gameBoard = new Board("Test", 3, 3);
        initializeCells(gameBoard);
    }

    /**
     * Extracts all cells from a 2D board array and stores them into {@code cellsList}.
     *
     * @param board the board to extract cells from
     * @return the flat list of cells, or {@code null} if the board is uninitialized
     */
    private List<Cell> initializeCells(Board board){
        Cell[][] boardCells = gameBoard.getGameBoard();

        if (boardCells != null) {
            for (Cell[] boardCellX : boardCells) {
                for (Cell boardCellY : boardCellX) {
                    cellsList.add(boardCellY);
                }
            }
            return cellsList;
        } else {
            System.err.println("Error encountered. Board was not initialized.");
            return null;
        }
    }

    /**
     * Searches for the first unoccupied cell on the board.
     *
     * @return a free cell if available; {@code null} otherwise
     */
    private Cell findFreeCell(){
        try {
            for (Cell cell : cellsList) {
                if (!cell.isOccupied()) {
                    return cell;
                }
            }
        } catch (Exception e) {
            System.err.println("No free cells were found.");
        } finally {
            checkFreeCells(); // Useful for debugging
        }
        return null; 
    }

    /**
     * Spawns a unit (currently always a {@link RangedUnit}) in the first free cell found.
     * The cell is marked as occupied, and the unit's position is set accordingly.
     */
    public void spawnUnit(){
        Cell spawnPoint = findFreeCell();
        if (spawnPoint == null) {
            System.err.println("No valid spawn point found.");
            return;
        }

        // TODO: Replace with a dynamic unit choice
        BaseUnit unit = new RangedUnit();
        unit.setPosition(spawnPoint);
        spawnPoint.setIsOccupied(true);

        // Debug output
        System.out.println("Spawnpoint in coordinates x:" + spawnPoint.getPosX() + ", y:" + spawnPoint.getPosY());
        System.out.println("Unit name is: " + unit.getUnitName() +
            ", position is x: " + unit.getPosition().getPosX() +
            ", y: " + unit.getPosition().getPosY());
    }

    /**
     * Logs information about all cells and their occupancy status.
     * Mainly used for debugging and visual inspection.
     */
    public void checkFreeCells() {
        for (Cell cell : cellsList) {
            System.out.println("Cell info:\nx: " + cell.getPosX() + " | y: " + cell.getPosY());
            if (!cell.isOccupied()) {
                System.out.println("Cell is free.");
            } else {
                System.out.println("Cell is occupied.");
            }
        }
    }

    /**
     * Returns the game board managed by this class.
     *
     * @return the {@link Board} instance
     */
    public Board getGameBoard() {
        return gameBoard;
    }
}
