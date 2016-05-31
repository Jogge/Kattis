import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class marko {
    public static void main(String[] args) throws IOException {
        new marko();
    }

    private marko() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Character, Character> keyboard = new HashMap<>();
        keyboard.put('a', '2');
        keyboard.put('b', '2');
        keyboard.put('c', '2');
        keyboard.put('d', '3');
        keyboard.put('e', '3');
        keyboard.put('f', '3');
        keyboard.put('g', '4');
        keyboard.put('h', '4');
        keyboard.put('i', '4');
        keyboard.put('j', '5');
        keyboard.put('k', '5');
        keyboard.put('l', '5');
        keyboard.put('m', '6');
        keyboard.put('n', '6');
        keyboard.put('o', '6');
        keyboard.put('p', '7');
        keyboard.put('q', '7');
        keyboard.put('r', '7');
        keyboard.put('s', '7');
        keyboard.put('t', '8');
        keyboard.put('u', '8');
        keyboard.put('v', '8');
        keyboard.put('w', '9');
        keyboard.put('x', '9');
        keyboard.put('y', '9');
        keyboard.put('z', '9');

        int n = Integer.parseInt(reader.readLine());

        String[] dictionary = new String[n];

        for(int i = 0; i < n; i++) {
            dictionary[i] = reader.readLine();
        }

        char[] input = reader.readLine().toCharArray();
        int inputLength = input.length;

        int counter = 0;

        dictionaryLoop:
        for(String word : dictionary) {

            if(word.length() != inputLength) {
                continue;
            }

            char[] letters = word.toCharArray();

            for(int i = 0; i < inputLength; i++) {
                if(keyboard.get(letters[i]) != input[i]) {
                    continue dictionaryLoop;
                }
            }

            counter++;
        }

        System.out.println(counter);
    }
}
