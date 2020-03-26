public interface ICard {
    ICard clone();
    void printInfo();
    void setRank(String rank);
    String getRank();
    String getSuit();
}
