package chess.pieces;

import boardgame.Board;
import chess.Color;

public class King extends chess.ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

}
