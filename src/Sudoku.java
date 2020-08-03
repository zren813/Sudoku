import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sudoku {
    private String numbers;
    private String[][] board;
    private boolean hasAnswer;
    public Sudoku() throws FileNotFoundException {
        File file = new File("src/database.txt");
        Scanner in = new Scanner(file);
        int lineCount = 0;
        while (in.hasNextLine()) {
            in.nextLine();
            lineCount++;
        }

        Scanner in2 = new Scanner(file);
        int randomNum = (int) (Math.random() * lineCount);
        for (int i = 0; i < randomNum; i++) {
            in2.nextLine();
        }
        numbers = in2.nextLine();
        board = new String[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = String.valueOf(numbers.charAt(i * 9 + j));
            }
        }
        hasAnswer = getAnswer(board);

    }
    public String getNumbers() {
        return numbers;
    }
    public boolean getHasAnswer() {
        return hasAnswer;
    }
    public String printBoard() {
        String temp = "";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                temp = temp + board[i][j];
            }
        }
        return temp;
    }

    public boolean getAnswer(String[][] board) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j].equals("0")) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }

            }
            if (!isEmpty) {
                break;
            }
        }
        if (isEmpty) {
            return true;
        }
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = String.valueOf(num);
                if (getAnswer(board)) {
                    return true;
                }
                else {
                    board[row][col] = "0";
                }
            }
        }
        return false;
    }
    public boolean isSafe(String[][] board, int row, int col, int num) {
        for (int d = 0; d < board.length; d++) {
            if (board[row][d].equals(String.valueOf(num))) {
                return false;
            }
        }
        for (int r = 0; r < board.length; r++) {
            if (board[r][col].equals(String.valueOf(num))) {
                return false;
            }
        }
        int sqrt = (int)Math.sqrt(board.length);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        for (int r = boxRowStart;
             r < boxRowStart + sqrt; r++) {
            for (int d = boxColStart;
                 d < boxColStart + sqrt; d++) {
                if (board[r][d].equals(String.valueOf(num))) {
                    return false;
                }
            }
        }
        return true;
    }


}
