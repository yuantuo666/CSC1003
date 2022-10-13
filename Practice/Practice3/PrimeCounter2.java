/**
 * Problem 5
 * 
 * [Optional] Counting primes. Write a program PrimeCounter that takes an integer 
 * command-line argument n and finds the number of primes less than or equal to n. Use it to 
 * print out the number of primes less than or equal to 10 million. Note: If you are not careful, 
 * your program may not finish in a reasonable amount of time!
 * Hint: To give an efficient program, you might need to use a boolean array.
 * 
 * Solution 2: A better way to calculate.
 * 
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/13
 */
public class PrimeCounter2 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        Boolean[] is_prime = new Boolean[n + 1];
        is_prime[0] = false;
        is_prime[1] = false;
        is_prime[2] = true;
        for (int i = 4; i < n; i += 2) {
            is_prime[i] = false;
        }
        for (int i = 3; i < n; i += 2) {
            is_prime[i] = true;
        }
        int times = 2;
        int itimes = 0;
        for (int i = 3; i < n; i++) {
            times = 2;
            itimes = times * i;
            while (itimes <= n) {
                is_prime[itimes] = true;
                times++;
                itimes = times * i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (is_prime[i] == true)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
