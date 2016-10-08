import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class vanishingparentheses {
    public static void main(String[] args) throws IOException {
        new vanishingparentheses();
    }

    private vanishingparentheses() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = reader.readLine()) != null) {
            String[] input = s.split(" ");

            ArrayList<Object> operations = new ArrayList<>();

            for (int i = 0; i < 1 + input.length / 2; i++) {
                operations.add(Integer.parseInt(input[i * 2]));
                if (i * 2 + 1 < input.length) {
                    String op = input[i * 2 + 1];
                    switch (op) {
                        case "+":
                            operations.add(Operator.ADDITION);
                            break;
                        case "-":
                            operations.add(Operator.SUBTRACTION);
                            break;
                        case "*":
                            operations.add(Operator.MULTIPLY);
                            break;
                    }
                }
            }

            TreeSet<Integer> result = p(operations);


            for (int n : result) {
                System.out.println(n);
            }
            System.out.println();
        }
    }

    HashMap<List<Object>, TreeSet<Integer>> subproblems = new HashMap<>();

    private TreeSet<Integer> p(List<Object> operations) {
        TreeSet<Integer> subproblem = subproblems.get(operations);
        if(subproblem != null) {
            return subproblem;
        }

        TreeSet<Integer> t = new TreeSet<>();

        if (operations.size() == 1) {
            t.add((Integer) operations.get(0));
        } else {
            for (int i = 1; i < operations.size(); i += 2) {
                TreeSet<Integer> left, right;
                left = p(operations.subList(0, i));
                right = p(operations.subList(i + 1, operations.size()));
                for (int j : left) {
                    for (int k : right) {
                        t.add(((Operator) operations.get(i)).apply(j, k));
                    }
                }
            }
        }

        subproblems.put(operations, t);
        return t;
    }

    private enum Operator {
        ADDITION("+") {
            @Override
            public int apply(int x1, int x2) {
                return x1 + x2;
            }
        },
        SUBTRACTION("-") {
            @Override
            public int apply(int x1, int x2) {
                return x1 - x2;
            }
        },
        MULTIPLY("*") {
            @Override
            public int apply(int x1, int x2) {
                return x1 * x2;
            }
        };

        private final String text;

        Operator(String text) {
            this.text = text;
        }

        public abstract int apply(int x1, int x2);

        @Override
        public String toString() {
            return text;
        }
    }
}