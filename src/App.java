import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMartch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMartch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            System.out.println(source);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);
            System.out.println(target);

            ChessPiece capturedPiece = chessMartch.performChessMove(source, target);
            System.out.println("Captured piece: " + capturedPiece);
            sc.close();
        }

    }
}
