public class RegularClientAbstractCostCalculator extends AbstractCostCalculator {
    public static int discountPercentage = 5;

    @Override
    public void setFinalPrice(Client client) {
        client.setPrice((int)Math.round(client.getPrice() * (100 - discountPercentage)/100.0));
    }
}
