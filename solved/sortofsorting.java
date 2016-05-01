import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class sortofsorting {
    public static void main(String[] args) throws IOException {
        new sortofsorting();
    }

    private sortofsorting() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(!(input = reader.readLine()).equals("0")) {
            int n = Integer.parseInt(input);
            Person[] persons = new Person[n];
            for(int i = 0; i < n; i++) {
                persons[i] = new Person(reader.readLine());
            }

            Arrays.sort(persons);

            for(Person p : persons) {
                System.out.println(p.lastName);
            }
            System.out.println();
        }
    }

    private class Person implements Comparable<Person> {
        final String lastName;

        private Person(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public int compareTo(Person o) {
            return lastName.substring(0,2).compareTo(o.lastName.substring(0,2));
        }
    }
}