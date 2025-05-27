package it.eneaminelli.boardgame;

/**
 * Represents the game board, composed of a grid of {@link Cell} objects.
 */
public class Board {
    private String boardName;
    private int widthX;
    private int heightY;
    private Cell[][] gameBoard;

    /**
     * Constructs a new Board with the given name, width, and height.
     * Initializes the game board with {@link Cell} objects.
     *
     * @param boardName The name of the board.
     * @param width     The width (number of columns) of the board.
     * @param height    The height (number of rows) of the board.
     */
    public Board(String boardName, int width, int height) {
        this.boardName = boardName;
        this.widthX = width;
        this.heightY = height;

        this.gameBoard = createBoard(width, height);
    }

    /**
     * Creates and initializes the 2D array representing the game board with {@link Cell} objects.
     *
     * @param width  The width of the board.
     * @param height The height of the board.
     * @return A 2D array of {@link Cell} objects representing the game board.
     */
    private Cell[][] createBoard(int width, int height) {
        Cell[][] newBoard = new Cell[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // Create a new Cell using its Builder, passing the coordinates
                Cell cell = new Cell.CellBuilder("Test Cell", x, y).build();
                newBoard[x][y] = cell;
            }
        }
        return newBoard;
    }

    /**
     * Prints the entire game board to the console by iterating through each cell.
     *
     * @return A String representation of all the cells in the board.
     */
    public String printBoard() {
        if (gameBoard == null) {
            return "No board exists.";
        } else {
            StringBuilder sb = new StringBuilder();
            // Iterate through the rows (height)
            for (int y = 0; y < gameBoard[0].length; y++) {
                // Iterate through the columns (width)
                for (int x = 0; x < gameBoard.length; x++) {
                    sb.append(gameBoard[x][y].toString()).append("\n");
                }
            }
            return sb.toString();
        }
    }

    /**
     * Returns the String representation of the {@link Cell} at the specified position.
     *
     * @param posX The x-coordinate (column index) of the cell.
     * @param posY The y-coordinate (row index) of the cell.
     * @return The String representation of the {@link Cell}.
     */
    public String printCell(int posX, int posY) {
        return gameBoard[posX][posY].toString();
    }

    /**
     * Main method for testing the Board class.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Board testBoard = new Board("Test", 3, 3);
        System.out.println(testBoard.printBoard());
        System.out.println("\n\nCoordinates are 1, 1:");
        System.out.println(testBoard.printCell(1, 1));
    }

}