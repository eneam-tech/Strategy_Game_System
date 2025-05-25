package it.eneaminelli.boardgame;

// TODO: Replace int[][] with Cell[][]
// - Create a Cell class with fields: int x, int y
// - Add a constructor to Cell: Cell(int x, int y)
// - Override toString() in Cell to return something like "(x,y)"
// - Update createBoard(): 
//     - Initialize each board[x][y] with new Cell(x, y)
// - Update printBoard(): 
//     - Print each Cell using toString()
// - (Optional) Add fields to Cell for game state (e.g., isOccupied, symbol)
// - (Optional) Add methods like choosePos(x, y) to interact with specific Cells

public class Cell {
    int posX, posY;

    public Cell() {
        posX = 0;
        posY = 0;
    }

    @Override
    public String toString() {
        String printString;
        printString = "|" + posX + ", " + posY + "|";

        return printString;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    
    
}
