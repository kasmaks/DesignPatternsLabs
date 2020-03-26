
public class Pupil {
    private String name;
    private String surname;
    private String school;
    private String className;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getClassName() {
        return className;
    }

    public String getSchool() {
        return school;
    }

    Pupil(String name, String surname, String school, String className) {
        this.name = name;
        this.surname = surname;
        this.school = school;
        this.className = className;
    }
}
