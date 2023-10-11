public class SelfAvoidingWalk {
    public static void main(String[] args) {
        int gridSize = 20;
        int trials = 3;
        int deadEnds = 0;

        for (int t = 0; t < trials; t++) {
            boolean[][] visited = new boolean[gridSize][gridSize];
            int x = gridSize / 2;
            int y = gridSize / 2;

            while (x > 0 && x < gridSize - 1 && y > 0 && y < gridSize - 1) {
                visited[x][y] = true;

                // Print current position
                System.out.println("Current position: (" + x + ", " + y + ")");

                if (visited[x - 1][y] && visited[x + 1][y] && visited[x][y - 1] && visited[x][y + 1]) {
                    deadEnds++;
                    System.out.println("Stuck in a dead end!");
                    break;
                }

                double r = Math.random();

                if (r < 0.25 && !visited[x + 1][y]) {
                    x++;
                } else if (r < 0.50 && !visited[x - 1][y]) {
                    x--;
                } else if (r < 0.75 && !visited[x][y + 1]) {
                    y++;
                } else if (!visited[x][y - 1]) {
                    y--;
                }
            }
        }

        System.out.println("Percentage of dead ends: " + (100 * deadEnds / trials) + "%");
    }
}
