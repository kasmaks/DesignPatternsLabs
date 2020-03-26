import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimpleBlackjackPlayer {
    private List<ICard> cards = new ArrayList<ICard>();
    private boolean myTurn = false;
    private int points = 0;

    public void addCard(ICard card) {
        cards.add(card);
    }

    public void setMyTurn(boolean myTurn) {
        this.myTurn = myTurn;
    }

    public int getPoints() {
        return points;
    }

    public void reset() {
        myTurn = false;
        points = 0;
        cards.clear();
    }

    public int countPoints() {
        for (ICard c: cards) {
            if(c.getRank() == "Ace") points += 11;
            else if(c.getRank() == "Jack" || c.getRank() == "Queen" || c.getRank() == "King") points += 10;
            else points += Integer.parseInt(c.getRank());
        }
        return points;
    }

    public int getCard(List<ICard> cards, int max) {
        Random random = new Random();
        int index = random.nextInt(max);
        this.addCard(cards.get(index));
        cards.remove(index);
        max -= 1;
        return max;
    }

    public void printCards() {
        for (ICard c: cards) {
            c.printInfo();
        }
    }
}
