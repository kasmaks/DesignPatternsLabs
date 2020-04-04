public class Buyer {
    private int budget = 0;
    Apartment apartment;
    Apartment desirableApartment = new Apartment();
    private IRealEstateMediator realEstateMediator;

    public void setDesirablePrice() {
        desirableApartment.setPrice(this.budget);
    }

    public void setDesirableSquare(int square) {
        desirableApartment.setSquare(square);
    }

    public void setDesirableBedrooms(int bedrooms) {
        desirableApartment.setBedrooms(bedrooms);
    }

    public void setDesirableLocation(boolean isNearTheCentre) {
        desirableApartment.setNearTheCentre(isNearTheCentre);
    }

    public void setDesirableRenovation(boolean isNewRenovation) {
        desirableApartment.setNewRenovation(isNewRenovation);
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public boolean reviewApartment(Apartment a) {
        if(a.getPrice() <= desirableApartment.getPrice() &&
        Math.abs(a.getBedrooms() - desirableApartment.getBedrooms()) <= 1 &&
        Math.abs(a.getSquare() - desirableApartment.getSquare()) <= 10 &&
        a.isNearTheCentre() == desirableApartment.isNearTheCentre() &&
        a.isNewRenovation() == desirableApartment.isNewRenovation()) {
            return true;
        }
        return false;
    }

    public void setRealEstateMediator(IRealEstateMediator realEstateMediator) {
        this.realEstateMediator = realEstateMediator;
        realEstateMediator.addBuyer(this);
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public void tryToBuy() {
        realEstateMediator.notifySeller(this);
    }

    public int getBudget() {
        return budget;
    }

    public Apartment getApartment() {
        return apartment;
    }
}
