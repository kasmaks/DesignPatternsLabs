
public class KPI_Student {
    private String name;

    public String getName() {
        return name;
    }

    KPI_Student(String  name) {
        this.name = name;
    }

    public double doTask(double a, double b) {
        ScintificCalculator calc = new ScintificCalculator();

        double result = calc.pow(a, calc.multiply(a, b));
        result += calc.sqrt(result);
        result += calc.add(result, 1333);
        result += calc.multiply(a, calc.pow(a - b, 2));
        result += calc.sqrt(result);
        result += calc.add(result, result - calc.sqrt(result));
        result = (result > 12200) ? calc.divide(result, 10000) : 0.;
        return result;
    }
}
