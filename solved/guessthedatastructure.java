import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class guessthedatastructure {
    public static void main(String[] args) throws IOException {
        new guessthedatastructure();
    }

    private guessthedatastructure() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input = reader.readLine()) != null) {
            int n = Integer.parseInt(input);

            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
            LinkedList<Integer> queue = new LinkedList<>();
            Stack<Integer> stack = new Stack<>();

            boolean isPriorityQueue = true;
            boolean isQueue = true;
            boolean isStack = true;
            boolean impossible = false;

            int size = 0;

            for(int i = 0; i < n; i++) {
                String[] line = reader.readLine().split(" ");

                //Put element
                if(line[0].equals("1")) {
                    size++;
                    priorityQueue.add(Integer.parseInt(line[1]));
                    queue.add(Integer.parseInt(line[1]));
                    stack.push(Integer.parseInt(line[1]));
                }
                //Take element
                else if(size > 0) {
                    size--;
                    int number = Integer.parseInt(line[1]);

                    int output = priorityQueue.poll();
                    if(output != number) {
                        isPriorityQueue = false;
                    }

                    output = queue.poll();
                    if(output != number) {
                        isQueue = false;
                    }

                    output = stack.pop();
                    if(output != number) {
                        isStack = false;
                    }
                } else {
                    impossible = true;
                }
            }

            if(impossible) {
                System.out.println("impossible");
                continue;
            }

            if(isPriorityQueue && !isQueue && !isStack) {
                System.out.println("priority queue");
            }
            else if(!isPriorityQueue && isQueue && !isStack) {
                System.out.println("queue");
            }
            else if(!isPriorityQueue && !isQueue && isStack) {
                System.out.println("stack");
            }
            else if(!isPriorityQueue && !isQueue && !isStack) {
                System.out.println("impossible");
            }
            else {
                System.out.println("not sure");
            }
        }
    }
}
