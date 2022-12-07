import java.util.Scanner;

/**
 * Problem
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/11/09
 */

public class MatrixMultiplication {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int m = input.nextInt();
        int n = input.nextInt();
        int p = input.nextInt();
        int[][] m1 = new int[m][n];
        int[][] m2 = new int[n][p];
        read_matrix(m1);
        read_matrix(m2);


        int[][] m3 = new int[m][p];
        multiplication(m1, m2, m3);
        print_matrix(m3);
    }

    public static void read_matrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }

    }

    public static void multiplication(int[][] m1, int[][] m2, int[][] m3) {
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                int sum = 0;
                for (int k = 0; k < m1[0].length; k++) { // k --> column of A and row of B
                    sum = sum + (m1[i][k] * m2[k][j]);
                }
                m3[i][j] = sum;
            }
        }

    }

    public static void print_matrix(int[][] m) {
        System.out.println(m.length + " " + m[0].length);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j != m[i].length - 1) System.out.print(m[i][j] + " ");
                else System.out.println(m[i][j]);
            }
        }
    }
}
