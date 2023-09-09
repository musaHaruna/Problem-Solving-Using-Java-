 public class ExchangingArray{
 public static void main(String[] args) {
   String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
   String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};


  String[] deck = new String[RANKS.length * SUITS.length];
  for (int i = 0; i < RANKS.length; i++) {
      for (int j = 0; j < SUITS.length; j++) {   
    
           String temp = deck[i];
           deck[i] = deck[j];
           deck[j] = temp;
           System.out.println(temp);
           // System.out.println(deck[i]);
           // System.out.println(temp);
 }
} 
}
}