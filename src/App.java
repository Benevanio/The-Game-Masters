import chess.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception {
        ChessMatch chessMartch = new ChessMatch();
        UI.printBoard(chessMartch.getPieces());
    }
}
