package it.eneaminelli.boardgame; 

public class Cell {
    // Private field to store the type of the cell
    private String cellType;

    @Override
    public String toString() {
        return "This cell is of type " + cellType + ". ";
    }

    // Private constructor used only by the builder to create Cell instances
    private Cell(CellBuilder builder) {
        // Assigns the cellType from the builder to the Cell
        this.cellType = builder.cellType;
    }

    // Static inner class that follows the Builder pattern to construct Cell objects
    public static class CellBuilder {
        // Field to store the type of cell to build
        private String cellType;

        // Constructor for the builder, sets the cellType
        public CellBuilder(String cellType) {
            this.cellType = cellType;
        }

        // Method to build and return a Cell instance
        public Cell build() {
            return new Cell(this); // Passes the builder itself to the Cell constructor
        }
    }

    // Main method for testing purposes — entry point when you run the class standalone
    public static void main(String[] args) {
        Cell simpleCell = new Cell.CellBuilder("Test Cell").build();

        System.out.println(simpleCell);
    }
}
