/**
 * Problem 4
 *
 * Read a positive integer x from the input, print true if x is a palindrome; otherwise,
 * print false. A palindrome is an integer that reads the same in original order (from
 * left to right) and in reverse order (from right to left). For example, 121 is a
 * palindrome, but 123 is not.
 * Hint: you can use an array to store each digit of the number and check each pair in the
 * array.
 * you can also think whether you can do this job without using an array.
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/26
 */
package Practice5;

import java.util.Scanner;

public class Palindrome {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String n = input.nextLine();
        String[] arr = n.split("");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(arr[arr.length - i -1])) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}