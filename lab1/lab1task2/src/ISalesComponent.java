
    public interface ISalesComponent {

    boolean sell(Cosmetic c, ISalesComponent buyer);
    void add(ISalesComponent c);
    void remove(ISalesComponent c);
    void buy(Cosmetic c);
    double getBudget();
    double getPrice();
    void setBoss(Manager boss);
    void setPrice(double price);
    String getName();
    void pay();
}
