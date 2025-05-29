package it.eneaminelli.boardgame;
public class App {
    public static void main(String[] args) {
        Board testBoard = new Board("Test", 3, 3);
        System.out.println(testBoard.printBoard());
        System.out.println("\n\nCoordinates are 1, 1:");
        System.out.println(testBoard.printCell(1, 1));
    }
}
