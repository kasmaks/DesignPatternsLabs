
public class Main {
    public static void main(String[] args) {

        Company company = new Company("Na Na Na", 100);

        Manager manager = new Manager();
        company.printBudget();
        manager.makePackage(company, 20 ,20);
        company.printBudget();
    }
}
