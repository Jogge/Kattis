import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class garden {
    public static void main(String[] args) throws IOException {
        new garden();
    }

    private garden() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(reader.readLine());
        String[] input = reader.readLine().split(" ");

        //p1: (x1,y1)
        double x1 = Double.parseDouble(input[0]);
        double y1 = Double.parseDouble(input[1]);

        input = reader.readLine().split(" ");
        //p2: (x2,y2)
        double x2 = Double.parseDouble(input[0]);
        double y2 = Double.parseDouble(input[1]);

        //Radius
        double r = 0;

        double dx = x2 - x1;
        double dy = y2 - y1;
        double dr = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        double d = x1 * y2 - x2 * y1;

        while (true) {
            r++;

            double area = Math.PI * Math.pow(r, 2);

            //If (0,0) is on the line between p1 and p2
            if((0 - x1) * (y2 - y1) - (0 - y1) * (x2 - x1) == 0) {
                if (area / 2 >= l) {
                    System.out.println((int) r);
                    return;
                } else {
                    continue;
                }
            }

            //If the line between p1 and p2 does not have two intersections
            if(Math.pow(r, 2) * Math.pow(dr, 2) - Math.pow(d, 2) <= 0) {
                if(area >= l) {
                    System.out.println((int) r);
                    return;
                } else {
                    continue;
                }
            }

            x1 = (d * dy + sgn(dy) * dx * Math.sqrt(Math.pow(r, 2) * Math.pow(dr, 2) - Math.pow(d, 2))) / Math.pow(dr, 2);
            y1 = ((0 - d) * dx + dy * sgn(dy) * Math.sqrt(Math.pow(r, 2) * Math.pow(dr, 2) - Math.pow(d, 2))) / Math.pow(dr, 2);

            x2 = (d * dy - sgn(dy) * dx * Math.sqrt(Math.pow(r, 2) * Math.pow(dr, 2) - Math.pow(d, 2))) / Math.pow(dr, 2);
            y2 = ((0 - d) * dx - dy * sgn(dy) * Math.sqrt(Math.pow(r, 2) * Math.pow(dr, 2) - Math.pow(d, 2))) / Math.pow(dr, 2);

            double cordLength = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));

            double angle = Math.acos((2 * Math.pow(r, 2) - Math.pow(cordLength, 2)) / (2 * Math.pow(r, 2)));

            double circularSegmentArea = (Math.pow(r, 2) / 2) * (angle - Math.sin(angle));

            area -= circularSegmentArea;

            if(area >= l) {
                System.out.println((int) r);
                return;
            }
        }
    }

    private int sgn(double x) {
        if(x < 0) return -1;
        else return 1;
    }

}
