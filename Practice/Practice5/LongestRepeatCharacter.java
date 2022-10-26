/**
 * Problem 2
 * <p>
 * Write a program that reads in a sequence of integers and prints both the integer that
 * appears in a longest consecutive run and the length of that run. For example, if the input
 * is 1 2 2 1 5 1 1 7 7 7 7 1 1, then your program should print Longest run: 4
 * consecutive 7s.
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/26
 */
package Practice5;

import java.util.Scanner;

public class LongestRepeatCharacter {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String s = input.nextLine();
        String[] strings = s.split(" ");
        String c = "";
        int c_repeat = 0;
        String longest_char = "";
        int longest_char_repeat = 0;

        for (int i = 0; i < strings.length; i++) {
            if (c.equals(strings[i]))
                c_repeat++;
            else {
                c_repeat = 1;
                c = strings[i];
            }

            if (c_repeat >= longest_char_repeat) {
                // update the longest
                longest_char = c;
                longest_char_repeat = c_repeat;
            }

        }

        System.out.println("Longest run: " + longest_char_repeat + " consecutive " + longest_char + "s.");
    }
}
