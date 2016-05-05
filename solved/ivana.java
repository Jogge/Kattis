import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class ivana {
    public static void main(String[] args) throws IOException {
        new ivana();
    }

    private ArrayList<Boolean> numbers = new ArrayList<>();

    private ivana() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        reader.readLine();

        for(String s : reader.readLine().split(" ")) {
            boolean isOdd = Integer.parseInt(s) % 2 == 1;
            numbers.add(isOdd);
        }

        int counter = 0;

        if(numbers.size() == 1) {
            if(numbers.get(0)) {
                counter++;
            }
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                int score = numbers.get(i) ? 1 : 0;

                score += score(false, moveLeftPointer(i), moveRightPointer(i));

                if (score > 0) counter++;
            }
        }

        System.out.println(counter);
    }

    private HashMap<String, Integer> map = new HashMap<>();

    private int score (boolean isIvanaToMove, int leftPointer, int rightPointer) {

        // xT (Base case - one number left to choose)
        if(leftPointer == rightPointer) {
            return numbers.get(leftPointer) ? (isIvanaToMove ? 1 : -1) : 0;
        }

        Integer mapValue = map.get(isIvanaToMove + ";" + leftPointer + ";" + rightPointer);
        if(mapValue != null) {
            return mapValue;
        }

        int result;

        // TxF
        if(numbers.get(leftPointer) && !numbers.get(rightPointer)) {
            if(isIvanaToMove) result = 1 + score(false, moveLeftPointer(leftPointer), rightPointer);
            else result = -1 + score(true, moveLeftPointer(leftPointer), rightPointer);
        }
        // FxT
        else if(!numbers.get(leftPointer) && numbers.get(rightPointer)) {
            if(isIvanaToMove) result = 1 + score(false, leftPointer, moveRightPointer(rightPointer));
            else result = -1 + score(true, leftPointer, moveRightPointer(rightPointer));
        }
        // TxT
        else if(numbers.get(leftPointer) && numbers.get(rightPointer)) {
            // TTxT
            if(numbers.get(moveLeftPointer(leftPointer))) {
                if(isIvanaToMove) result = 1 + score(false, moveLeftPointer(leftPointer), rightPointer);
                else result = -1 + score(true, moveLeftPointer(leftPointer), rightPointer);
            }
            // FTxT(T|F)
            else {
                if(isIvanaToMove) result = 1 + score(false, leftPointer, moveRightPointer(rightPointer));
                else result = -1 + score(true, leftPointer, moveRightPointer(rightPointer));
            }
        }
        // FxF
        else {
            // FFxF
            if(!numbers.get(moveLeftPointer(leftPointer))) {
                result = score(!isIvanaToMove, moveLeftPointer(leftPointer), rightPointer);
            }
            // TFxFF
            else if(!numbers.get(moveRightPointer(rightPointer))) {
                result = score(!isIvanaToMove, leftPointer, moveRightPointer(rightPointer));
            }
            // TFxFT
            else {
                int p1 = score(!isIvanaToMove, moveLeftPointer(leftPointer), rightPointer);
                int p2 = score(!isIvanaToMove, leftPointer, moveRightPointer(rightPointer));
                if(isIvanaToMove) result = Math.max(p1, p2);
                else result = Math.min(p1, p2);
            }
        }

        map.put(isIvanaToMove + ";" + leftPointer + ";" + rightPointer, result);
        return result;
    }

    private int moveLeftPointer(int leftPointer) {
        leftPointer--;
        if(leftPointer == -1) {
            leftPointer = numbers.size() - 1;
        }
        return leftPointer;
    }

    private int moveRightPointer(int rightPointer) {
        rightPointer++;
        if(rightPointer == numbers.size()) {
            rightPointer = 0;
        }
        return rightPointer;
    }
}
