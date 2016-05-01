import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class names {
    public static void main(String[] args) throws IOException {
        new names();
    }

    private names() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        if(input.length()==1) {
            System.out.println(0);
            return;
        }
        int result = Integer.MAX_VALUE;
        for(int i = (int) Math.ceil(((double) input.length()) / 2.0); i < input.length(); i++) {
            char[] list1 = input.substring(0, i).toCharArray();
            char[] list2 = input.substring(i, input.length()).toCharArray();
            int counter = list1.length;
            for(int j =0; j<list1.length && j<list2.length; j++) {
                char c2 = list2[j];
                char c1 = list1[list1.length-1-j];
                if(c2==c1) {
                    counter--;
                }
            }
            if(counter < result) result = counter;
        }

        for(int i = input.length() / 2; i < input.length(); i++) {
            char[] list1 = input.substring(0, i).toCharArray();
            char[] list2 = input.substring(i+1, input.length()).toCharArray();
            int counter = list1.length;
            for(int j =0; j<list1.length && j<list2.length; j++) {
                char c2 = list2[j];
                char c1 = list1[list1.length-1-j];
                if(c2==c1) {
                    counter--;
                }
            }
            if(counter < result) result = counter;
        }
        System.out.println(result);
    }
}
