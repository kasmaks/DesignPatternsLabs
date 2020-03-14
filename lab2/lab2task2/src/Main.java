
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Maks", "Kasner", "Yuriyovych");
        person.setAge(19);

        Greeting greeting = new Greeting();

        greeting.greet(person);
    }
}
