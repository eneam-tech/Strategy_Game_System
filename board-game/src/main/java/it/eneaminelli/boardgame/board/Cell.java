package it.eneaminelli.boardgame.board; 

import it.eneaminelli.boardgame.units.BaseUnit;

public class Cell {
    // Private field to store the type of the cell
    private String cellType;
    private int posX, posY;
    private boolean isOccupied = false;
    protected BaseUnit occupyingUnit;

    @Override
    public String toString() {
        return "\nThis cell is of type " + cellType + ".\n " + 
        "It is in coordinates " + posX + ", " + posY;
    }

    // Private constructor used only by the builder to create Cell instances
    private Cell(CellBuilder builder) {
        // Assigns the cellType from the builder to the Cell
        this.cellType = builder.cellType;
        this.posX = builder.posX;
        this.posY = builder.posY;
    }

    public String getCellType() {
        return cellType;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public void setOccupyingUnit(BaseUnit unit){
        this.occupyingUnit = unit;
    }

    public BaseUnit getOccupyingUnit(){
        System.out.println("There's a unit of name: " + occupyingUnit.getUnitName());
        return occupyingUnit;
    }
    // Static inner class that follows the Builder pattern to construct Cell objects
    public static class CellBuilder {
        private String cellType;
        private int posX, posY;
        
        public CellBuilder(String cellType, int posX, int posY) {
            this.cellType = cellType;
            this.posX = posX;
            this.posY = posY;
        }

        public Cell build() {
            return new Cell(this);
        }
    }

    // Main method for testing purposes — entry point when you run the class standalone
    public static void main(String[] args) {
        Cell testCell = new Cell.CellBuilder("Test cell", 9, 9).build();
        System.out.println("Iteration 1: " + testCell);

        System.out.println("Iteration 2: " + testCell);
    }
}
