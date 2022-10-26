/**
 * Problem 3
 *
 * Write a filter that reads in a sequence of integers and prints the integers, removing repeated
 * values that appear consecutively. For example, if the input is 1 2 2 1 5 1 1 7 7 7 7
 * 1 1, then your program should print 1 2 1 5 1 7 1.
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/26
 */
package Practice5;

import java.util.Scanner;

public class Filter {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String s = input.nextLine();
        String[] strings = s.split(" ");
        String printed = "";
        for (int i = 0; i < strings.length; i++) {
            if (!printed.equals(strings[i])) {
                printed = strings[i];
                if (i != strings.length - 1)
                    System.out.print(strings[i] + " ");
                else
                    System.out.println(strings[i]);
            }
        }
    }
}
