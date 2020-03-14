
public class Manager implements IAccounting{

    Accounting accounting = new Accounting(10);

    public void makePackage(Company company, int days, int workers) {

        int price = accounting.getOrderPrice(days, workers, accounting.getMonthSalary());
        if(company.getBudget() >= price) {
            accounting.makePackage(company, days, workers);
            company.withdraw(price);
        }
        else System.out.println("Hahhhah, you have only " + company.getBudget() + " dollars, but you have to pay " + price + " dollars, go away " + company.getCompanyName());
    }
}
