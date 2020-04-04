import java.util.ArrayList;
import java.util.List;

public class RealEstateMediator implements  IRealEstateMediator {
    List<Buyer> buyers = new ArrayList<Buyer>();
    List<Seller> sellers = new ArrayList<Seller>();

    public void notifyBuyer(Seller s) {
        for (Buyer b: buyers) {
            if(b.reviewApartment(s.getApartment())) {
                sell(b, s);
                break;
            }
        }
    }

    public void notifySeller(Buyer b) {
        for (Seller s: sellers) {
            if(b.reviewApartment(s.getApartment())) {
                sell(b, s);
                break;
            }
        }
    }

    private void sell(Buyer b, Seller s) {
        System.out.println("Sold!");
        b.setApartment(s.getApartment());
        b.setBudget(b.getBudget() - s.getApartment().getPrice());
        s.setBudget(s.getBudget() + s.getApartment().getPrice());
        s.setApartment(null);
        buyers.remove(b);
        sellers.remove(b);
    }

    public void addSeller(Seller s) {
        sellers.add(s);
    }

    public void addBuyer(Buyer b) {
        buyers.add(b);
    }
}
