/**
 * Problem 5
 *
 * [Optional] Given an integer N, print the first N rows of Pascal's triangle. In Pascal's
 * triangle, each number is the sum of the two numbers directly above it as shown.
 * If n is 5, the first 5 rows of your program output looks like the following:
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * Hint: you can use a 2-dimensional array to implement this program
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/20
 */

import java.util.Scanner;

public class PascalTriangle {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int N = Integer.parseInt(input.nextLine());
        if (N <= 0) return;
        int[][] arr = new int[N][N];
        arr[0][0] = 1;

        for (int i = 1; i < N; i++) {
            arr[i][0] = arr[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0)
                    if (j != arr[i].length - 1)
                        System.out.print(arr[i][j] + " ");
                    else
                        System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
