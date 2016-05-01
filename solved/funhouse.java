import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class funhouse {
    public static void main(String[] args) throws IOException {
        new funhouse();
    }

    private funhouse() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int houseNum = 0;
        while(!(input = reader.readLine()).equals("0 0")) {
            houseNum++;

            int numCols = Integer.parseInt(input.split(" ")[0]);
            int numRows = Integer.parseInt(input.split(" ")[1]);
            char[][] map = new char[numRows][numCols];

            int startRow = 0;
            int startCol = 0;

            for(int i = 0; i < numRows; i++) {
                input = reader.readLine();
                map[i] = input.toCharArray();

                if(input.contains("*")) {
                    startRow = i;
                    startCol = input.indexOf("*");
                }
            }

            Direction direction = Direction.RIGHT;

            if(startRow == 0) {
                direction = Direction.DOWN;
            } else if(startRow == numRows - 1) {
                direction = Direction.UP;
            } else if(startCol == numCols - 1) {
                direction = Direction.LEFT;
            }

            int row = startRow;
            int col = startCol;

            while(map[row][col] != 'x') {
                if(direction == Direction.UP) {
                    row--;
                } else if(direction == Direction.RIGHT) {
                    col++;
                } else if(direction == Direction.DOWN) {
                    row++;
                } else {
                    col--;
                }

                if(map[row][col] == '/') {
                    if(direction == Direction.UP) {
                        direction = Direction.RIGHT;
                    } else if(direction == Direction.RIGHT) {
                        direction = Direction.UP;
                    } else if(direction == Direction.DOWN) {
                        direction = Direction.LEFT;
                    } else {
                        direction = Direction.DOWN;
                    }
                } else if(map[row][col] == '\\') {
                    if(direction == Direction.UP) {
                        direction = Direction.LEFT;
                    } else if(direction == Direction.RIGHT) {
                        direction = Direction.DOWN;
                    } else if(direction == Direction.DOWN) {
                        direction = Direction.RIGHT;
                    } else {
                        direction = Direction.UP;
                    }
                }
            }

            map[row][col] = '&';
            System.out.println("HOUSE " + houseNum);
            for(char[] r : map) {
                System.out.println(new String(r));
            }
        }
    }

    private enum Direction {
        UP, RIGHT, DOWN, LEFT
    }
}
