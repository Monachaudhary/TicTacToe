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
        
            //check the rows
            for(int row=0;row<board.length;row++){
                if(board[row][0]==player&&board[row][1]==player&&board[row][2]==player){
                    return true;
                }
            }
                //check the column
             for(int col=0;col<board.length;col++){
                 if(board[0][col]==player&&board[1][col]==player&&board[2][col]==player){
                     return true;
                 }
             }    
            

        //check diagonal
        if(board[0][0]==player && board[1][1]==player && board[2][2] == player){
            return true;
        }
        if(board[0][2]==player && board[1][1] ==player && board[2][0]==player){
            return true;
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
