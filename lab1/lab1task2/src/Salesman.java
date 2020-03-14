
public class Salesman  extends Manager {

    Salesman(String name, Cosmetic c, int budget) {
        super(name, c, budget);
    }

    @Override

    public void add(ISalesComponent c) {
        System.out.println("I'm just a salesman, I cannot be a boss");
    }
    public void remove(ISalesComponent c) {
        System.out.println("You cannot remove, I've got nothing");
    }

    public boolean sell(Cosmetic c) {
        if(price > maxPrice) System.out.println("I(" + name + ") cannot sell you this cosmetic, I won't get any profit");
        else if(quantity <= 0) System.out.println("I(" + name +  ") don't have " + c.getName() + " cosmetic");
        else {
            System.out.println("That's a deal! I sold you " + c.getName() + " for " + c.getPrice() + " dollars");
            putInPocket();
            return true;
        }
        return false;
    }

}
