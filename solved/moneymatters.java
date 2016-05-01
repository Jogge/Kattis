import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class moneymatters {
    public static void main(String[] args) throws IOException {
        new moneymatters();
    }

    private moneymatters() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Person[] persons = new Person[n];

        for(int i = 0; i < n; i++) {
            persons[i] = new Person(Integer.parseInt(reader.readLine()));
        }

        for(int i = 0; i < m; i++) {
            input = reader.readLine().split(" ");
            int p1 = Integer.parseInt(input[0]);
            int p2 = Integer.parseInt(input[1]);

            persons[p1].addFriend(persons[p2]);
            persons[p2].addFriend(persons[p1]);
        }

        for(Person person : persons) {
            if(person.visited) {
                continue;
            }

            person.visited = true;

            if(getMoneySumOfFriends(person) != 0) {
                System.out.println("IMPOSSIBLE");
                return;
            }
        }

        System.out.println("POSSIBLE");
    }

    private int getMoneySumOfFriends(Person person) {
        int sum = person.money;
        person.visited = true;
        for(Person friend : person.friends) {
            if(!friend.visited) {
                sum += getMoneySumOfFriends(friend);
            }
        }
        return sum;
    }

    private class Person {
        HashSet<Person> friends = new HashSet<>();
        final int money;
        boolean visited = false;

        Person(int money) {
            this.money = money;
        }

        void addFriend(Person friend) {
            friends.add(friend);
        }
    }
}
