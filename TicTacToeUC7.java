import java.util.Random;

public class TicTacToeUC7 {

    public static void main(String[] args) {

        char[][] board = {
                {'X', 'O', ' '},
                {' ', 'X', ' '},
                {'O', ' ', ' '}
        };

        char computerSymbol = 'O';

        makeComputerMove(board, computerSymbol);

        printBoard(board);
    }

    // Computer move logic
    public static void makeComputerMove(char[][] board, char symbol) {

        Random random = new Random();

        int row, col;

        while (true) {

            int slot = random.nextInt(9) + 1; // 1–9

            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (isValidMove(board, row, col)) {
                board[row][col] = symbol;
                break;
            }
        }
    }

    // Reuse validation logic
    public static boolean isValidMove(char[][] board, int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        return board[row][col] == ' ';
    }

    // Print board
    public static void printBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        }
    }
}