package it.eneaminelli.boardgame;

public class Board {
    private int width, height;

    private Cell[][] gameBoard;

    public Board(int width, int height) {
        this.height = height;
        this.width = width;

        gameBoard = createBoard(width, height);
    }

    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public Cell[][] getGameBoard() {
        return gameBoard;
    }
    
    public void setGameBoard(Cell[][] gameBoard) {
        this.gameBoard = gameBoard;
    }
    
    private Cell[][] createBoard(int width, int height) {
        Cell[][] newBoard = new Cell[width][height];
        
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Cell cell = new Cell();
                cell.setPosX(x); 
                cell.setPosY(y);
                newBoard[x][y] = cell;
            }
        }

        return newBoard;

    }

    public void printBoard() {
        if(this.gameBoard == null) {
            System.err.println("The game board does not exist.");
        } else {
            for(int x = 0; x < this.gameBoard.length; x++) {
                for (int y = 0; y < this.gameBoard[x].length; y++) {
                    System.out.print("" + this.gameBoard[x][y]);
                    
                }
                System.out.println("|");
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        Board board = new Board(5, 5);

        board.printBoard();

    }
    
}
