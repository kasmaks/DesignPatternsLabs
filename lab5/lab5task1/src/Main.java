public class Main {
    public static void main(String[] args) {

        Customer c = new Customer(100);

        Friend f1 = new Friend(200);
        Friend f2 = new Friend(500);

        c.setFriend(f1);
        //f1.setNext(f2);

        Seller s = new Seller();

        c.buy(s);

        System.out.println(s.getSlaves().toString());
    }
}
