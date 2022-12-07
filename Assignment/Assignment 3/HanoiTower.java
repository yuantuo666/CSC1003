import java.util.Scanner;

/**
 * Problem
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/11/28
 */

public class HanoiTower {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = input.nextInt();
        int from = input.nextInt();
        int to = input.nextInt();
        int utilize = input.nextInt();
        move(n, from, to, utilize);
    }

    public static void move(int n, int from, int to, int utilize) {
        if (n == 1) {
            System.out.println(from + "->" + to);
            return;
        }
        move(n - 1, from, utilize, to);
        move(1, from, to, utilize);
        move(n - 1, utilize, to, from);
    }
}
