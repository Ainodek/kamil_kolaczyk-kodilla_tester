public class User {
    String name;
    int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        double avgAge = 0;
        User kamil = new User("Kamil", 30);
        User maciek = new User("Maciej", 25);
        User monika = new User("Monika", 35);
        User pawel = new User("Pawel", 28);
        User jozek = new User("Jozek", 70);

        User[] users = new User[]{kamil, maciek, monika, pawel, jozek};

        //Wyliczenie średniej wieku
        for (int i = 0; i < users.length; i++) {
            avgAge += users[i].getAge();
            if (i == users.length - 1) {
                avgAge = avgAge / users.length;
            }
        }
        System.out.println("Srednia wisku to: " + avgAge);

        //Wyświetlanie imion dla wieku poniżej średniej
        System.out.println("Użytkownicy z wiekiem poniżej średniej to:");
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < avgAge) {
                System.out.println(users[i].getName());
            }
        }
    }
}
