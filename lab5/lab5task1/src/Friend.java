public class Friend implements   PurchaseHandler {

    private int budget;
    private PurchaseHandler next = null;

    public void setNext(PurchaseHandler next) {
        this.next = next;
    }

    public void lendMoney(int money, Customer c) {
        if(canHandle(money)) {
            System.out.println("I lend you " + money + " grn");
            budget -= money;
            c.increaseBudget(money);
        }
        else if(next != null) {
            System.out.println("I can't lend you " + money + " grn, but maybe my friend can");
            next.lendMoney(money, c);
        }
    }

    public boolean canHandle(int money) {
        if(budget >= money + 100) return true;
        return false;
    }

    Friend(int budget) {
        this.budget = budget;
    }
}
