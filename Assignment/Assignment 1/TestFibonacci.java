/**
 * TestFibonacci
 *
 * Write a Java program named “TestFibonacci.java” which reads two non-negative numbers from the console by using System.in.
 * Denote the two numbers by n and d, and the program is expected to output d elements of the series
 * from n-th element (i.e. a[n-1]) in the reverse order on the console by using System.out.
 * An example is given below. (You can assume that the numbers are no larger than 100000).
 *
 * @version 2022.10.04-22:11
 * @email 122090513@link.cuhk.edu.cn
 */
import java.util.*;
public class TestFibonacci {
    static Scanner input = new Scanner(System.in);
	public static void parse_line(int n, int d) {
        // 0th: analyse input
        if (n < d)
        {
            System.out.println("invalid");
            return;
        }
        if (n > 92)
        {
            System.out.println("Too lager to handle");
            return;
        }
        n--;
        // 1st: generate the array
        int length = (n > 0) ? n+1 : 2;
        long[] series = new long[length];
        series[0] = 1;
        series[1] = 1;
        for (int i = 2; i <= n; i++)
        {
            series[i] = series[i-1] + series[i-2];
        }
        // 2nd: print the result
        for (int i = n; i > n-d; i--)
        {
            System.out.print(series[i]);
            if (i != (n-d+1))
                System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int line_number = Integer.parseInt(input.nextLine()); 
        for(int i = 0; i < line_number; i++) {
            String s = input.nextLine();
            String t[] = s.split(", ");
            int n = Integer.parseInt(t[0]);
            int d = Integer.parseInt(t[1]);
            TestFibonacci.parse_line(n, d);
        }
    }
}