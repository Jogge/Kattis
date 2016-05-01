import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class juryjeopardy {
    public static void main(String[] args) throws IOException {
        new juryjeopardy();
    }

    private enum Orientation {
        UP, LEFT, RIGHT, DOWN
    }

    private Orientation o;

    private juryjeopardy() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.println(n);
        for(int i = 0; i < n; i++) {
            o = Orientation.RIGHT;
            String input = reader.readLine();

            char[][] map = new char[100][200];
            int x = 0;
            int y = 100;
            map[x][y] = '.';

            int maxX = x;
            int maxY = y;
            int minY = y;

            for(int j = 0; j < input.length(); j++) {
                Coordinate coordinate = getNextCoordinate(input.charAt(j), x, y);
                x = coordinate.x;
                y = coordinate.y;
                map[x][y] = '.';
                maxX = Math.max(maxX, x);
                maxY = Math.max(maxY, y);
                minY = Math.min(minY, y);
            }
            if(i>0) System.out.println();
            System.out.println((maxY-minY+3) + " " + (maxX+2));
            for(int k = minY-1; k <= maxY+1; k++) {
                if(k>minY-1) System.out.println();
                for(int j = 0; j <= maxX+1; j++) {
                    if(map[j][k] == '.') {
                        System.out.print(".");
                    } else {
                        System.out.print("#");
                    }
                }
            }
        }
    }


    private Coordinate getNextCoordinate(char m, int x, int y) {
        if(o == Orientation.LEFT) {
            if(m == 'F') {
                return new Coordinate(x-1, y);
            }
            if(m == 'L') {
                o = Orientation.DOWN;
                return new Coordinate(x, y+1);
            }
            if(m == 'R') {
                o = Orientation.UP;
                return new Coordinate(x, y-1);
            }
            if(m == 'B') {
                o = Orientation.RIGHT;
                return new Coordinate(x+1, y);
            }
        } else if(o == Orientation.UP) {
            if(m == 'F') {
                o = Orientation.UP;
                return new Coordinate(x, y-1);
            }
            if(m == 'L') {
                o = Orientation.LEFT;
                return new Coordinate(x-1, y);
            }
            if(m == 'R') {
                o = Orientation.RIGHT;
                return new Coordinate(x+1, y);
            }
            if(m == 'B') {
                o = Orientation.DOWN;
                return new Coordinate(x, y+1);
            }
        } else if(o == Orientation.RIGHT) {
            if(m == 'F') {
                o = Orientation.RIGHT;
                return new Coordinate(x+1, y);
            }
            if(m == 'L') {
                o = Orientation.UP;
                return new Coordinate(x, y-1);
            }
            if(m == 'R') {
                o = Orientation.DOWN;
                return new Coordinate(x, y+1);
            }
            if(m == 'B') {
                o = Orientation.LEFT;
                return new Coordinate(x-1, y);
            }
        } else if(o == Orientation.DOWN) {
            if(m == 'F') {
                o = Orientation.DOWN;
                return new Coordinate(x, y+1);
            }
            if(m == 'L') {
                o = Orientation.RIGHT;
                return new Coordinate(x+1, y);
            }
            if(m == 'R') {
                o = Orientation.LEFT;
                return new Coordinate(x-1, y);
            }
            if(m == 'B') {
                o = Orientation.UP;
                return new Coordinate(x, y-1);
            }
        }
        return null;
    }


    private class Coordinate {
        private final int x;
        private final int y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


}
