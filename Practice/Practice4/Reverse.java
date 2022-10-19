/**
 * Problem 2
 *
 * Read n numbers from the command arguments, and output the in reverse order.
 * For example, if you give 5 integers 1 2 3 4 5 as the input, the output should be 5 4 3 2 1.
 * You can also use Scanner to get the input from standard input stream, if you want
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/19
 */
import java.util.Scanner;

public class Reverse {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String s = input.nextLine();
        String t[] = s.split(" ");
        int[] Arr = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            Arr[t.length-i-1]=Integer.parseInt(t[i]);
        }
        for (int i = 0; i <Arr.length; i++) {
                if(i != Arr.length-1)
                    System.out.print(Arr[i]+" ");
                else
                    System.out.println(Arr[i]);
        }
    }
}
