public class Gambler {
    public static void main(String[] args) {
        int stake = 1; // Initial amount of money the gambler starts with
        int goal = 6;  // The target amount the gambler wants to reach
        int trials = 1; // Number of trials or experiments to run
        int bets = 0; // Total number of bets made across all trials
        int wins = 0; // Number of times the gambler reached the goal

        for (int t = 0; t < trials; t++) {
            int cash = stake; // Initialize the gambler's cash for the current trial
          System.out.println("Random " + (Math.random() < 0.5));
            while (cash > 0 && cash < goal) {
                // Simulate one bet: The gambler wins with a 50% probability.
                bets++;
System.out.println("Random " + (Math.random() < 0.5));

                if (Math.random() < 0.5)  {
                  cash++; // Win
                  System.out.println("cash++ " + cash);
                } 
                else {
                     // System.out.println("Random " + (Math.random() < 0.5));
                     cash--;
                     // System.out.println("cash-- " + cash);
                } // Lose
                
                 System.out.println("bets " + bets);
               
              
            }

            // At the end of the trial, 'cash' is either 0 (ruin) or equal to 'goal' (win).
            if (cash == goal) wins++; // The gambler reached the goal.
        }

        // Print the results after all trials.
        System.out.println(100 * wins / trials + "% wins"); // Percentage of successful trials
        System.out.println("Avg # bets: " + (double) bets / trials); // Average number of bets per trial
    }
}
