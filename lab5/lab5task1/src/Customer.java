public class Customer {
    private int budget;
    private int products = 0;
    private Friend friend = null;

    public void borrowMoney(int money, Friend f) {
         f.lendMoney(money, this);
    }

    Customer(int budget) {
        this.budget = budget;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public void buy(Seller s) {
        if(budget >= s.getPrice()) {
            this.products += 1;
            budget -= s.getPrice();
            System.out.println("I bought a product");
        }
        else if(friend != null) {
            borrowMoney(s.getPrice() - budget, friend);
            if(budget >= s.getPrice()) {
                this.products += 1;
                budget -= s.getPrice();
                System.out.println("I borrowed some money and bought a product");
            }
            else getLoan(s);
        }
        else  {
            System.out.println("You don't have any friend");
            getLoan(s);
        }
    }

    public void getLoan(Seller s) {
        products += 1;
        System.out.println("Cool, I got a loan");
        s.lendMoney(budget,this);
        budget = 0;
    }

    public void increaseBudget(int money) {
        budget += money;
    }

    public int getBudget() {
        return budget;
    }
}
