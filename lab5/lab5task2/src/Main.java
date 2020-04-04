public class Main {
    public static void main(String[] args) {

        IRealEstateMediator realEstateMediator = new RealEstateMediator();

        Buyer b1 = new Buyer();
        b1.setBudget(100_000);
        b1.setDesirablePrice();
        b1.setDesirableLocation(true);
        b1.setDesirableRenovation(false);
        b1.setDesirableBedrooms(3);
        b1.setDesirableSquare(55);

        Apartment a = new Apartment(80000, 2, 60, true, false);

        Seller s1 = new Seller(a);


        s1.setRealEstateMediator(realEstateMediator);
        b1.setRealEstateMediator(realEstateMediator);

        b1.tryToBuy();
        b1.getApartment().getInformation();
        System.out.println(b1.getBudget());
    }
}
