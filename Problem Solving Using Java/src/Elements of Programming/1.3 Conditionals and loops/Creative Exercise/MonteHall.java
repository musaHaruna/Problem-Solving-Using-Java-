import java.util.Random;
/*
 Game simulation. In the game show Let’s Make a Deal, a contestant is presented
with three doors. Behind one of them is a valuable prize. After the contestant
chooses a door, the host opens one of the other two doors (never revealing the prize,
of course). The contestant is then given the opportunity to switch to the other
unopened door. Should the contestant do so? Intuitively, it might seem that the
contestant’s initial choice door and the other unopened door are equally likely to
contain the prize, so there would be no incentive to switch. Write a program MonteHall
to test this intuition by simulation. Your program should take a commandline
argument n, play the game n times using each of the two strategies (switch or
do not switch), and print the chance of success for each of the two strategies.
 */

public class MonteHall {
    public static void main(String[] args) {
        int n = 1000; // Number of trials (hardcoded)

        int switchWins = 0;
        int stayWins = 0;

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            // Simulate one instance of the game with switching strategy
            int prizeDoor = random.nextInt(3);
            int chosenDoor = random.nextInt(3);
            int revealedDoor;
            do {
                revealedDoor = random.nextInt(3);
            } while (revealedDoor == chosenDoor || revealedDoor == prizeDoor);
            chosenDoor = 3 - chosenDoor - revealedDoor;
            if (chosenDoor == prizeDoor) {
                switchWins++;
            }

            // Simulate one instance of the game without switching strategy
            prizeDoor = random.nextInt(3);
            chosenDoor = random.nextInt(3);
            revealedDoor = random.nextInt(3);
            while (revealedDoor == chosenDoor || revealedDoor == prizeDoor) {
                revealedDoor = random.nextInt(3);
            }
            if (chosenDoor == prizeDoor) {
                stayWins++;
            }
        }

        double switchWinRate = (double) switchWins / n * 100;
        double stayWinRate = (double) stayWins / n * 100;

        System.out.println("Switching doors success rate: " + switchWinRate + "%");
        System.out.println("Not switching doors success rate: " + stayWinRate + "%");
    }
}
