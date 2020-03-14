
public class Person {
    private String name;
    private String surname;
    private String patronymic;
    private int age;

    Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = 0;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        if(age > 0) this.age = age;
    }
}
