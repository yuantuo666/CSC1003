/**
 * Problem 4
 *
 * b) [Optional] If we have n random walkers, starting from the center, their moves are
 * independent from each other, what is the average number of steps taken before all cells are
 * touched?
 * Hint: apart from the 2-dimentional boolean array used in a), you can use two more 1-
 * dimensional int arrays to track the current position (indexes in the lattice) of each random
 * walker.
 *
 * Suppose: after the walker near the wall, he doesn't run into the wall.
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/20
 */

import java.util.Scanner;

public class RandomWalker2 {
    public static Scanner input = new Scanner(System.in);

    public static boolean CheckTouch(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!arr[i][j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(input.nextLine()); // how many random walker
        int N = Integer.parseInt(input.nextLine());
        int Trials = Integer.parseInt(input.nextLine());
        int step = 0;
        for (int t = 0; t < Trials; t++) {
            int[][] position = new int[n][2];
            boolean[][] a = new boolean[N][N];
            for (int i = 0; i < n; i++) {
                position[i][0] = position[i][1] = N / 2;
            }

            boolean keepWalking = true;
            while (keepWalking) {
                step++;

                for (int i = 0; i < n; i++) {
                    int x = position[i][0];
                    int y = position[i][1];
                    a[x][y] = true;
                    double r = Math.random();
                    if (r < 0.25) {
                        if (x+1 <= N-1) x++;
                    } else if (r < 0.50) {
                        if (x-1 >= 0) x--;
                    } else if (r < 0.75) {
                        if (y+1 <= N-1) y++;
                    } else if (r < 1.00) {
                        if (y-1 >= 0) y--;
                    }
                    position[i][0] = x;
                    position[i][1] = y;
                }
                if (RandomWalker2.CheckTouch(a)) keepWalking = false;
            }
        }

        System.out.println("Average steps: " + step/Trials);
    }
}
