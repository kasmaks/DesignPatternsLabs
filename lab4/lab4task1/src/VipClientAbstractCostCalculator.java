public class VipClientAbstractCostCalculator extends AbstractCostCalculator {
    public static int discountPercentage = 10;
    @Override
    public void setFinalPrice(Client client) {
        if(client.getMonthsInClub() >= 6) client.setPrice((int)Math.round(client.getPrice() * (100 - discountPercentage - RegularClientAbstractCostCalculator.discountPercentage)/100.0));
        else client.setPrice((int)Math.round(client.getPrice() * (100 - discountPercentage)/100.0));
    }
}
