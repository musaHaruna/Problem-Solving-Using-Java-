public class ExchangingArray {
    public static void main(String[] args) {
        String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[RANKS.length * SUITS.length];
        int cardIndex = 0;

        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[cardIndex] = RANKS[i] + " of " + SUITS[j];
                cardIndex++;
            }
        }

        // Print the original deck
        System.out.println("Original Deck:");
        for (String card : deck) {
            System.out.println(card);
        }

        // Shuffle the deck by exchanging elements
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int) (Math.random() * deck.length);

            // Swap elements at i and randomIndex
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        // Print the shuffled deck
        System.out.println("\nShuffled Deck:");
        for (String card : deck) {
            System.out.println(card);
        }
    }
}
