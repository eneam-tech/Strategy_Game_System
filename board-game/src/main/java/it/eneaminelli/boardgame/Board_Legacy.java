package it.eneaminelli.boardgame;

public class Board_Legacy {
    private int width, height;

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
    
    public int[][] createBoard(int width, int height) {
        int[][] newBoard = new int[width][height];

        for (int x = 0; x <= width; x++) {
            System.out.print("\n");
            for (int y = 0; y <= height; y++) {
                System.out.print("|" + x + "," + y);
            }
            System.out.print("|");
        }
        System.out.print("\n");

        System.out.println("\nNew board at address " + newBoard);
        return newBoard;
    }

    int[][] gameBoard = createBoard(width, height);

    public void printBoard(int[][] board) {
        for(int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[0].length; y++) {
                System.out.print("|" + board[x][y] + board[y][y]);
                
            }
            System.out.println("|");
        }
    }
    
    
    public static void main(String[] args) {
        Board_Legacy board = new Board_Legacy();
        int[][] boardTest = board.createBoard(6, 5);
        board.printBoard(boardTest);
    }
    
}
