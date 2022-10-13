/**
 * Problem 4
 * 
 * Modify Factors to print just one copy each of the prime divisors. Currently, executing 
 * Factors with argument 98 gives us:
 * % java Factors 98
 * % 2 7 7
 * After modifications, the output should be 
 * % java Factors 98
 * % 2 7
 * 
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/13
 */
public class Factors {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        int printed_i = 0; // record the printed i
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                if (printed_i != i) { // if not printed, then record and print
                    printed_i = i;
                    System.out.print(i + " ");
                }
                n = n / i;
            }
        }
        if (n > 1)
            System.out.println(n);
        else
            System.out.println();
    }
}
