public class Clubs implements ICard {

    private String rank;
    private final String suit = "clubs";

    public String getSuit() {
        return suit;
    }

    public ICard clone() {
        return new Clubs();
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

