public abstract class AbstractCostCalculator {
    protected static int price = 2000;
    public static void setPrice(Client client) {
        if(client.getAge() <= 16) {
            client.setPrice(price - 100);
        }
        else {
            client.setPrice(price);
        }
    }

    public abstract void setFinalPrice(Client client);


    public void cost(Client client) {
        setPrice(client);
        setFinalPrice(client);
    }
}
