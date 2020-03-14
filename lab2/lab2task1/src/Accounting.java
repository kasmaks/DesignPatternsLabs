
public class Accounting implements IAccounting {

    private int monthSalary;

    Accounting(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public void makePackage(Company company, int days, int workers) {
        int price = getOrderPrice(days, workers, monthSalary);
        System.out.println("------This document is created for " + company.getCompanyName() + " by accounting centre------");
        System.out.println("------" + workers + " workers have worked for " + days + " days and have done a lot of work for your company------");
        System.out.println("------So you have to pay " + price + " dollars to our company for this work------");
    }

    public int getOrderPrice(int days, int workers, int monthSalary) {
        double price = days * workers * monthSalary / 30;
        return (int)Math.ceil(price * 1.4);
    }

    public int getMonthSalary() {
        return monthSalary;
    }

}
