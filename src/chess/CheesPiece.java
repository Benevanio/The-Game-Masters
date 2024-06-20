package chess;

import boardgame.Board;
import boardgame.Piece;

public class CheesPiece extends Piece {
    private Color color;

    public CheesPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

}
