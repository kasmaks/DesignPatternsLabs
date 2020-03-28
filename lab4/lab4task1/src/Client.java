public class Client {
    private String name;
    private int age;
    private int monthsInClub = 0;
    private boolean vipClient = false;
    private int price;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMonthsInClub() {
        return monthsInClub;
    }

    public boolean isVipClient() {
        return vipClient;
    }

    Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setMonthsInClub(int monthsInClub) {
        this.monthsInClub = monthsInClub;
    }

    public void setVipClient(boolean vipClient) {
        this.vipClient = vipClient;
    }
}
