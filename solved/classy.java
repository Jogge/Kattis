import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class classy {
    public static void main(String[] args) throws IOException {
        new classy();
    }

    private classy() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine());
            Person[] persons = new Person[n];
            for(int j = 0; j < n; j++) {
                String[] input = reader.readLine().split(" ");
                String name = input[0].replace(":", "");
                ArrayList<String> classes = new ArrayList<>(Arrays.asList(input[1].split("-")));
                persons[j] = new Person(name, classes);
            }

            Arrays.sort(persons);

            for(Person p : persons) {
                System.out.println(p.name);
            }
            System.out.println("==============================");
        }
    }

    private class Person implements Comparable<Person> {
        final String name;
        final String myClass;

        Person(String name, ArrayList<String> classes) {
            this.name = name;
            String myClass = "";
            for(String s: classes) {
                myClass += getValue(s);
            }
            myClass = new StringBuilder(myClass).reverse().toString();
            myClass += "2222222222";
            this.myClass = myClass;
        }

        int compare(String myClass, String otherClass) {
            for(int i = 0; i < myClass.length() && i < otherClass.length(); i++) {
                if(myClass.charAt(i) != otherClass.charAt(i)) {
                    return otherClass.charAt(i) - myClass.charAt(i);
                }
            }
            return 0;
        }

        String getValue(String value) {
            if(value.equals("lower")) {
                return "1";
            } else if(value.equals("middle")) {
                return "2";
            } else {
                return "3";
            }
        }

        @Override
        public int compareTo(Person o) {
            int compareValue = compare(myClass, o.myClass);
            if(compareValue == 0) {
                return name.compareTo(o.name);
            }
            return compareValue;
        }
    }
}