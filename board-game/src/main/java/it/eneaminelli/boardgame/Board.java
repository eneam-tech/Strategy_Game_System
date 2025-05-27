package it.eneaminelli.boardgame;

public class Board {
    private String boardName;
    private int widthX, heightY;
    private Cell[][] gameBoard;
    
    public Board(String boardName, int width, int height){
        this.boardName = boardName;
        this.widthX = width;
        this.heightY = height;

        gameBoard = createBoard(width, height);
    }

    private Cell[][] createBoard(int width, int height) {
        Cell[][] newBoard = new Cell[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Cell cell = new Cell.CellBuilder("Test Cell", x, y).build();
                newBoard[x][y] = cell;
            }
        }
        return newBoard;
    }

    public String printBoard() {
        if(gameBoard == null) {
            return "No board exists.";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int y = 0; y < gameBoard[0].length; y++) { // Iterate through rows (height)
                for (int x = 0; x < gameBoard.length; x++) {   // Iterate through columns (width)
                    sb.append(gameBoard[x][y].toString()).append("\n");
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Board testBoard = new Board("Test", 3, 3);
        System.out.println(testBoard.printBoard());
    }

}
