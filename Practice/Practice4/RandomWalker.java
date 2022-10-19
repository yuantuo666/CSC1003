/**
 * Problem 4
 * <p>
 * a) Suppose that a random walker, starting in the center of an n-by-n grid, move one step at
 * a time, choosing to go left, right, up, or down with equal probability at each step. Write a
 * program to simulate the process and compute the average number of steps taken before all
 * cells are touched by repeat the trials for T times. n and T can be given by command-line
 * arguments (or standard input).
 * Hint: you can use a 2-dimensional boolean array to record whether the corresponding cells
 * are touched or not. Refer SelfAvoidingWalker in lecture note.
 * <p>
 * Suppose: after the walker near the wall, he doesn't run into the wall.
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/19
 */

import java.util.Scanner;

public class RandomWalker {
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
        int N = Integer.parseInt(input.nextLine());
        int Trials = Integer.parseInt(input.nextLine());
        int step = 0;
        for (int t = 0; t < Trials; t++) {
            boolean[][] a = new boolean[N][N];
            int x = N / 2, y = N / 2;

            boolean keepWalking = true;
            while (keepWalking) {
                step++;
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
                if (RandomWalker.CheckTouch(a)) keepWalking = false;
            }
        }

        System.out.println("Average steps: " + step/Trials);
    }
}
