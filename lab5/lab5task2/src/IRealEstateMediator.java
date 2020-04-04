public interface IRealEstateMediator {
    void notifyBuyer(Seller s);
    void notifySeller(Buyer b);
    void addSeller(Seller s);
    void addBuyer(Buyer b);
}
