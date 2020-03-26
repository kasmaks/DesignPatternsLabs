public class Diamonds implements ICard {

    private String rank;
    private final String suit = "diamonds";

    public String getSuit() {
        return suit;
    }

    public ICard clone() {
        return new Diamonds();
    }

    public void printInfo() {
        System.out.println(suit + " " + rank);
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
