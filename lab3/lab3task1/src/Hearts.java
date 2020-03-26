public class Hearts implements ICard {

    private String rank;
    private final String suit = "hearts";

    public String getSuit() {
        return suit;
    }

    public ICard clone() {
        return new Hearts();
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

