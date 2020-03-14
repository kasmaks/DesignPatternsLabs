
public class ShevaStudent implements IStudent {
    private String name;

    public String getName() {
        return name;
    }

    ShevaStudent(String  name) {
        this.name = name;
    }

    public double doTask(double a, double b) {
        SimpleCalculator calc = new SimpleCalculator();

        double result = calc.multiply(calc.add(a, b), calc.substract(a, b));
        return result;
    }
}
