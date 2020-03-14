import java.util.ArrayList;
import java.util.List;

public class Manager implements ISalesComponent {

    private List<ISalesComponent> childrens = new ArrayList<ISalesComponent>();
    protected Manager boss = null;

    protected String name;

    final protected double maxPrice = 150;
    protected double price;
    protected double budget;
    protected int quantity = 1;

    public void setBoss(Manager boss) {
        this.boss = boss;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public double getPrice() {
        return price;
    }

    public double getBudget() {
        return budget;
    }

    public String getName() {
        return name;
    }



    Manager(String name, Cosmetic c, int budget) {
        this.name = name;
        this.price = c.getPrice();
        this.budget = budget;
    }

    public boolean sell(Cosmetic c, ISalesComponent buyer) {
        if(price > maxPrice) System.out.println("I(" + name + ")cannot sell you this cosmetic, I won't get any profit");
        else if(quantity <= 0) System.out.println("I(" + name + ") don't have " + c.getName() + " cosmetic");
        else if(buyer.getBudget() < price) {
            System.out.println("You(" + buyer.getName() + ") don't have enough money, bro");
        }
        else {
            buyer.pay();
            System.out.println("That's a deal! I(" + name + ") sold " + c.getName() + " for " + buyer.getName() + " for " + price + " dollars");
            putInPocket();
            return true;
        }
        return false;
    }

    public void add(ISalesComponent c) {
        childrens.add(c);
        c.setBoss(this);
        c.setPrice(price * 1.25);
    }

    public void remove(ISalesComponent c) {
        childrens.remove(c);
    }

    protected void putInPocket() {
        budget += price;
        if(boss != null) {
            double fee = boss.getPercents();
            budget -= fee;
        }
        quantity -= 1;
    }

    public void pay() {
        budget -= boss.getPrice();
        quantity += 1;
    }

    public void printInfo() {
        System.out.println("I'm " + name + " . I have " + childrens.size() + " salesman and " + budget + " dollars!");
        System.out.println("I can sell you " + quantity + " cosmetics");
    }

    public void buy(Cosmetic c) {
        if(boss != null) {
            boss.sell(c, this);
        }
        else System.out.println("You don't have a boss. You're BOSS");
    }

    private double  getPercents() {
        double fee = price * 1.25 / 25;
        budget += fee;
        return fee;
    }
}
