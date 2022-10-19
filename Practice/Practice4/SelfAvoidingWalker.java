/**
 * Problem 3
 * <p>
 * Modify SelfAvoidingWalker to calculate the average length of the paths that reaches a dead
 * end. For example, suppose we have 10 trials, if 3 paths reach the dead end with lengths of
 * 10, 20, and 15, then the average is 15.
 * You can also compute the average length to escape from the lattice.
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/19
 */
public class SelfAvoidingWalker {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;
        int escape = 0;
        int[] deadEndsRecord = new int[trials];
        int[] escapeRecord = new int[trials];
        for (int t = 0; t < trials; t++) {
            boolean[][] a = new boolean[N][N];
            int x = N / 2, y = N / 2;
            int step = 0;
            Boolean isOver = false;
            while (x > 0 && x < N - 1 && y > 0 && y < N - 1) {
                step++;
                if (a[x - 1][y] && a[x + 1][y] && a[x][y - 1] && a[x][y + 1]) {
                    deadEndsRecord[deadEnds] += step;
                    deadEnds++;
                    isOver = true;
                    break;
                }
                a[x][y] = true;
                double r = Math.random();
                if (r < 0.25) {
                    if (!a[x + 1][y]) x++;
                } else if (r < 0.50) {
                    if (!a[x - 1][y]) x--;
                } else if (r < 0.75) {
                    if (!a[x][y + 1]) y++;
                } else if (r < 1.00) {
                    if (!a[x][y - 1]) y--;
                }
            }
            if (!isOver){
                // Escape!
                escapeRecord[escape] += step;
                escape++;
            }
        }

        // Calculate the average length
        float sumOfSteps = 0;
        for (int i = 0; i < deadEnds; i++) {
            sumOfSteps += deadEndsRecord[i];
        }
        float deadEndsAverage = sumOfSteps / deadEnds;

        sumOfSteps = 0;
        for (int i = 0; i < escape; i++) {
            sumOfSteps += escapeRecord[i];
        }
        float escapeAverage = sumOfSteps / escape;
        System.out.println("Dead ends average lengths: " + deadEndsAverage);
        System.out.println("Escape average lengths: " + escapeAverage);
    }
}
