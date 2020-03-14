
public class Greeting {

    GreetingForOld greetingForOld = new GreetingForOld();
    GreetingForYoung greetingForYoung = new GreetingForYoung();

    public void greet(Person person) {
        if(person.getAge() > 35 || person.getAge() == 0)
            greetingForOld.greet(person);
        else greetingForYoung.greet(person);
    }
}
