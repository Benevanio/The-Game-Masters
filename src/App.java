import chess.ChessMartch;

public class App {
    public static void main(String[] args) throws Exception {
        ChessMartch chessMartch = new ChessMartch();
        UI.printBoard(chessMartch.getPieces());
    }
}
