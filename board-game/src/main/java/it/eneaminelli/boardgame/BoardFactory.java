package it.eneaminelli.boardgame;

public abstract class BoardFactory {
    public GameBoard create(){
        GameBoard board = createGameBoard();
        board.build();
        return board;
    }

    protected abstract GameBoard createGameBoard();
}
