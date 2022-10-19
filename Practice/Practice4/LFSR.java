/**
 * Problem 1
 *
 * Use array(s) to simulate the Linear Feedback Shift Register (LFSR) with tap positions at 11
 * and 9, and the contents in the below figure as the initial fill.
 * Hint: you can find the reference code in the lecture note "CS.0.Prologue"
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/19
 */
public class LFSR {
    public static void main(String[] args) {
        int[] a = { 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0 };
        for (int t = 0; t < 2000; t++)
        {
            a[0] = (a[11] ^ a[9]);
            System.out.print(a[0]);
            for (int i = 11; i > 0; i--)
                a[i] = a[i-1];
        }
        System.out.println();
    }
}
