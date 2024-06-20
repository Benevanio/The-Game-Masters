package chess;

import boardgame.Board;

public class ChessMartch {
    private Board board;

    public ChessMartch() {
        this.board = new Board(8, 8);
    }

    public ChessMartch(Board board) {
        this.board = board;
    }

    public CheesPiece[][] getPieces() {
        CheesPiece[][] mat = new CheesPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (CheesPiece) board.piece(i, j);
            }
        }
        return mat;
    }

}
