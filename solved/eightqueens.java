import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class eightqueens {
    public static void main(String[] args) throws IOException {
        new eightqueens();
    }

    private eightqueens() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] board = new boolean[8][8];
        int numQueens = 0;
        for(int i = 0; i<8; i++) {
            String line = reader.readLine();
            char[] chars = line.toCharArray();
            for(int j = 0; j<8; j++) {
                if(chars[j]=='*') {
                    board[i][j] = true;
                    numQueens++;
                }
            }
        }

        if(numQueens!=8) {
            System.out.println("invalid");
            return;
        }

        for(int i = 0; i<8; i++) {
            for(int j = 0; j<8; j++) {
                if(board[i][j]){
                    //Right
                    for(int k = j+1; k<8; k++) {
                        if(board[i][k]) {
                            System.out.println("invalid");
                            return;
                        }
                    }

                    //Down
                    for(int k = i+1; k<8; k++) {
                        if(board[k][j]) {
                            System.out.println("invalid");
                            return;
                        }
                    }

                    //Right-down diagonal
                    for(int k = 1; Math.max(i,j)+k<8; k++) {
                        if(board[i+k][j+k]) {
                            System.out.println("invalid");
                            return;
                        }
                    }

                    //Left-down diagonal
                    for(int k = 1; i+k<8 && j-k>=0 ; k++) {
                        if(board[i+k][j-k]) {
                            System.out.println("invalid");
                            return;
                        }
                    }
                }
            }
        }

        System.out.println("valid");
    }
}
