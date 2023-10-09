import java.util.Scanner;

public class TicTac {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }

        }
        char player = 'X';
        boolean gameover = false;
        Scanner sc = new Scanner(System.in);
        while (!gameover) {
            printBoard(board);
            System.out.println("Player" + player + "enter:");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if (board[row][col] == ' ') {
                board[row][col] = player; // place the elements
                gameover = haveWon(board, player);
                if (gameover) {
                    System.out.println("player" + player + "has won");
                } else {
                    if (player == 'X') {
                        player = '0';
                    } else {
                        player = 'X';
                    }
                }

            } else {
                System.out.println("Invalid move");
            }
        }
        printBoard(board);
    }

    private static boolean haveWon(char[][] board, char player) {
        for (int i = 0; i < board.length; i++) {

        }
        return false;
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();

        }
    }

}
