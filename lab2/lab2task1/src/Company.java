
public class Company {
    private int budget;
    private String companyName;

    public Company(String companyName, int budget) {
        this.budget = budget;
        this.companyName = companyName;
    }

    public void withdraw(int price) {
        this.budget -= price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getBudget() {
        return budget;
    }

    public void printBudget() {
        System.out.println("Budget : " + this.getBudget());
    }

}
