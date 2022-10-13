/**
 * Problem 5
 * 
 * [Optional] Counting primes. Write a program PrimeCounter that takes an integer 
 * command-line argument n and finds the number of primes less than or equal to n. Use it to 
 * print out the number of primes less than or equal to 10 million. Note: If you are not careful, 
 * your program may not finish in a reasonable amount of time!
 * Hint: To give an efficient program, you might need to use a boolean array.
 * 
 * Solution 1: Taking more time to calculate.
 * 
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/13
 */
public class PrimeCounter {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int[] primes = new int[10000000];
        int Index = 0;

        Boolean notPrime = false;

        for (int i = 2; i <= n; i++) {
            notPrime = false;
            // check each i if they are prime

            for (int j = 0; j < Index; j++)
                if (i % primes[j] == 0) {
                    // not prime
                    notPrime = true;
                    break;
                }

            if (notPrime)
                continue;

            primes[Index] = i; // record
            Index++;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
