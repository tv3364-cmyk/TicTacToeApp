public class TicTacToeUC6 {

    public static void main(String[] args) {

        // Create empty board
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        int row = 1;
        int col = 1;
        char symbol = 'X';

        // Update board
        updateBoard(board, row, col, symbol);

        // Print board
        printBoard(board);
    }

    // Method to update board
    public static void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Method to print board
    public static void printBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        }
    }
}