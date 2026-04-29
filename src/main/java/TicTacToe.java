public class TicTacToe {


        // UC1 — Initialize and display an empty board
        static char[][] board = new char[3][3];  // 2D Array: 3 rows × 3 columns

        public static void initBoard() {
            // Nested loops — visit every cell in the 2D array
            for (int i = 0; i < 3; i++) {         // outer loop: rows
                for (int j = 0; j < 3; j++) {     // inner loop: columns
                    board[i][j] = '-';            // initialize each cell with '-'
                }
            }
        }

        public static void displayBoard() {
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " | ");  // formatted console output
                }
                System.out.println();
                System.out.println("-------------");
            }
        }

        public static void main(String[] args) {
            initBoard();      // Step 1: initialize board
            displayBoard();   // Step 2: print board
        }

}
