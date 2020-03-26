import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        ICard diamondsCard = new Diamonds();
        ICard heartsCard = new Hearts();
        ICard spadesCard = new Spades();
        ICard clubsCard = new Clubs();
        List<ICard> cards = new ArrayList<ICard>();

        for (int i = 0, j = 0; i < 52; i += 4, j++) {
            ICard card1 = diamondsCard.clone();
            ICard card2 = heartsCard.clone();
            ICard card3 = spadesCard.clone();
            ICard card4 = clubsCard.clone();

            ICard[] cards1 = {card1, card2, card3, card4};

            for(int k = 0; k < 4; k++) {
                cards1[k].setRank(ranks[j]);
                cards.add(cards1[k]);
            }
        }

        for(int i = 0; i < 52; i++) {
            ICard c = cards.get(i);
            c.printInfo();
        }

        System.out.println("\n\nLet the play begin\n");

        SimpleBlackjackPlayer player1 = new SimpleBlackjackPlayer();
        SimpleBlackjackPlayer player2 = new SimpleBlackjackPlayer();

        int max = 52;
        for(int i = 0; i < 3; i++) {
            max = player1.getCard(cards, max);

            max = player2.getCard(cards, max);
        }

        player1.countPoints();
        player2.countPoints();

        System.out.println("Player 1: " + player1.getPoints() );
        player1.printCards();
        System.out.println("Player 2: " + player2.getPoints() );
        player2.printCards();
    }
}
