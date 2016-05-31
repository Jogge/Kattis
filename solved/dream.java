import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

class dream {
    public static void main(String[] args) throws IOException {
        new dream();
    }

    private dream() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> events = new HashMap<>();
        Stack<String> eventStack = new Stack<>();

        int n = Integer.parseInt(reader.readLine());

        EventLoop:
        for(int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            switch (input[0]) {
                case "E":
                    events.put(input[1], eventStack.size());
                    eventStack.push(input[1]);
                    break;
                case "D":
                    for (int j = 0; j < Integer.parseInt(input[1]); j++) {
                        events.remove(eventStack.pop());
                    }
                    break;
                default:
                    int maxTime = eventStack.size();
                    int minTime = -1;

                    for (int j = 0; j < Integer.parseInt(input[1]); j++) {
                        Integer eventTime;
                        boolean hasOccurred = !input[j + 2].startsWith("!");

                        if (!hasOccurred) {
                            eventTime = events.get(input[j + 2].substring(1));
                            if (eventTime != null) {
                                maxTime = Math.min(eventTime, maxTime);
                            }
                        } else {
                            eventTime = events.get(input[j + 2]);
                            if (eventTime != null) {
                                minTime = Math.max(eventTime, minTime);
                            } else {
                                System.out.println("Plot Error");
                                continue EventLoop;
                            }
                        }
                    }

                    if (eventStack.size() == 0) {
                        System.out.println("Yes");
                    } else if (maxTime > minTime) {
                        if (maxTime == eventStack.size()) {
                            System.out.println("Yes");
                        } else {
                            System.out.println((eventStack.size() - maxTime) + " Just A Dream");
                        }
                    } else if (maxTime == 0 && minTime == -1) {
                        System.out.println(eventStack.size() + " Just A Dream");
                    } else {
                        System.out.println("Plot Error");
                    }

                    break;
            }
        }
    }
}
