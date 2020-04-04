import java.util.HashMap;
import java.util.Map;

public class Seller implements  PurchaseHandler {
    private int budget = 0;
    private int products = 10;
    private int price = 300;
    private Map<Customer, Integer> slaves = new HashMap<Customer, Integer>();
    public int getPrice() {
        return price;
    }

    public void sell() {
        products -= 1;
        budget += price;
    }

    public void lendMoney(int money, Customer c) {
        slaves.put(c, price - c.getBudget());
        products -= 1;
        System.out.println("+1 slave, Hahhahhahah");
    }

    public Map<Customer, Integer> getSlaves() {
        return slaves;
    }
}
