public class TicTacToe {
    private Character[][] board;
    private int movesCount;

    public TicTacToe() {
        board = new Character[3][3];
        movesCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = null;
            }
        }
    }

    public boolean set(int row, int col, char player) {
        if (row < 0 || row > 2 || col < 0 || col > 2) return false;
        if (board[row][col] != null) return false;
        if (player != 'O' && player != 'X') return false;

        board[row][col] = player;
        movesCount++;
        return true;
    }

    public String evaluate() {
        // 檢查行與列
        for (int i = 0; i < 3; i++) {
            if (checkLine(board[i][0], board[i][1], board[i][2])) return board[i][0] + " wins";
            if (checkLine(board[0][i], board[1][i], board[2][i])) return board[0][i] + " wins";
        }
        // 檢查對角線
        if (checkLine(board[0][0], board[1][1], board[2][2])) return board[0][0] + " wins";
        if (checkLine(board[0][2], board[1][1], board[2][0])) return board[0][2] + " wins";

        if (movesCount == 9) return "Draw";

        return "Ongoing";
    }

    private boolean checkLine(Character c1, Character c2, Character c3) {
        return c1 != null && c1.equals(c2) && c2.equals(c3);
    }
}
