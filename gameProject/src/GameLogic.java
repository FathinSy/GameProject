import java.util.Random;

public class GameLogic {

    private char[] board;
    private Random random;

    public GameLogic() {
        board = new char[9];
        random = new Random();
        resetBoard();
    }

    public void resetBoard() {
        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public boolean makeMove(int index, char symbol) {

        if (index < 0 || index >= 9) {
            return false;
        }

        if (board[index] != ' ') {
            return false;
        }

        board[index] = symbol;
        return true;
    }

    public boolean checkWinner(char symbol) {

        int[][] patterns = {
                {0,1,2},
                {3,4,5},
                {6,7,8},
                {0,3,6},
                {1,4,7},
                {2,5,8},
                {0,4,8},
                {2,4,6}
        };

        for (int[] pattern : patterns) {

            if (board[pattern[0]] == symbol
                    && board[pattern[1]] == symbol
                    && board[pattern[2]] == symbol) {

                return true;
            }

        }

        return false;
    }

    public boolean isDraw() {

        for (char cell : board) {

            if (cell == ' ') {
                return false;
            }

        }

        return true;
    }

    public int computerMove() {

        while (true) {

            int index = random.nextInt(9);

            if (board[index] == ' ') {

                board[index] = 'O';
                return index;

            }

        }

    }

    public char[] getBoard() {
        return board;
    }

}