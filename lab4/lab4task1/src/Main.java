public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ivan", 99);
        client.setMonthsInClub(8);
        client.setVipClient(true);

        AbstractCostCalculator costCalculator = null;

        if(client.isVipClient()) costCalculator = new VipClientAbstractCostCalculator();
        else if(client.getMonthsInClub() >= 6) costCalculator = new RegularClientAbstractCostCalculator();
        else costCalculator = new CostCalculator();

        costCalculator.cost(client);

        System.out.println(client.getName() + " have to pay " + client.getPrice());
    }
}
