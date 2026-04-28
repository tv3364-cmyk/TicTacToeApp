public class TicTacToeUC5 {

    public static void main(String[] args) {

        // Sample board
        char[][] board = {
                {'X', 'O', ' '},
                {' ', 'X', ' '},
                {'O', ' ', ' '}
        };

        int row = 1;
        int col = 0;

        if (isValidMove(board, row, col)) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }
    }

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != ' ') {
            return false;
        }

        return true;
    }
}