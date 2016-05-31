import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class _2048 {
    public static void main(String[] args) throws IOException {
        new _2048();
    }

    private int[][] board = new int[4][4];

    private _2048() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 4; i++) {
            board[i] = Arrays.asList(reader.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        }

        int direction = Integer.parseInt(reader.readLine());

        for(int i = 0; i < direction; i++) {
            rotateBoardCounterclockwise();
        }

        moveLeft();

        for(int i = 0; i < (4 - direction) % 4; i++) {
            rotateBoardCounterclockwise();
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(j != 0) System.out.print(" ");
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private void moveLeft() {
        for(int i = 0; i < 4; i++) {
            int tile = 0;
            for(int j = 1; j < 4; j++) {
                if(board[i][j] != 0) {
                    if(board[i][tile] == 0) {
                        board[i][tile] = board[i][j];
                        board[i][j] = 0;
                    } else if(board[i][tile] == board[i][j]) {
                        board[i][tile] = board[i][j] * 2;
                        board[i][j] = 0;
                        tile++;
                    } else if(board[i][tile] != board[i][j]) {
                        tile++;
                        if(tile != j) {
                            board[i][tile] = board[i][j];
                            board[i][j] = 0;
                        }
                    }
                }
            }
        }
    }

    private void rotateBoardCounterclockwise() {
        int[][] input = new int[4][4];

        for(int i = 0; i < 4; i++) {
            System.arraycopy(board[i], 0, input[i], 0, 4);
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                board[i][j] = input[j][3-i];
            }
        }
    }
}
