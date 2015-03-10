/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] suits = {"diamond","heart"};
		String[] ranks = {"john", "arin", "mihir"};
		int[] points =  {1,3,2};
		Deck deck = new Deck(ranks,suits,points);
		Deck deck2= new Deck(ranks,suits,points);
		Deck deck3 = new Deck(ranks,suits,points);
		System.out.println(deck);
		System.out.println(deck.isEmpty());
		System.out.println(deck.size());
		System.out.println(deck.deal());
		System.out.println(deck);
		System.out.println(deck.deal());
		System.out.println(deck);
	}
}
