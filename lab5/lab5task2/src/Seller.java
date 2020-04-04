public class Seller {
    private Apartment apartment;
    private int budget = 0;
    private IRealEstateMediator realEstateMediator;
    Seller(Apartment a) {
        this.apartment = a;
    }

    public void setRealEstateMediator(IRealEstateMediator realEstateMediator) {
        this.realEstateMediator = realEstateMediator;
        realEstateMediator.addSeller(this);
    }

    public void tryToSell() {
        realEstateMediator.notifyBuyer(this);
    }

    public Apartment getApartment() {
        return apartment;
    }

    public int getBudget() {
        return budget;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
