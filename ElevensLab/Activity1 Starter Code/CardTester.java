/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        Card card1 = new Card("King", "Diamonds", 13);       
        Card card2 = new Card("King", "Diamonds", 13);
        Card card3 = new Card("Tem", "Clubs", 10);
        System.out.println(card1.suit());
        System.out.println(card2.rank());
        System.out.println(card3.pointValue());
        System.out.println(card1.matches(card2));
        System.out.println(card1.matches(card3));
        System.out.println(card3);
    }
}
