/**
 * Problem 1
 *
 * Write a program that reads in floating-point numbers (as many as the user enters) from
 * standard input and
 * a) prints the maximum and minimum values.
 * b) prints the mean (average value) and sample standard deviation (square root of the sum
 * of the squares of their differences from the average, divided by n-1, where n is the
 * number of double values from input)
 * Hint: you can use Scanner or StdIn for handling standard input streams, the latter needs
 * to have stdlib.jar available.
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/26
 */
package Practice5;

import java.util.Scanner;

public class MathAnalysis {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double sum = 0;
        int num = 0;
        double[] Numbers = new double[200000000];

        while (input.hasNextDouble()) {
            double x = input.nextDouble();
            Numbers[num] = x;
            num = num + 1;
//            sum = sum + x;
        }

        double max = max(Numbers, num);
        double min = min(Numbers, num);

        double average = average(Numbers, num);
        double deviation = deviation(Numbers, average, num);

        System.out.println("Maximum:" + max);
        System.out.println("Minimum:" + min);
        System.out.println("Average:" + average);
        System.out.println("Standard deviation:" + deviation);

    }

    public static double max(double[] arr, int num) {
        double Max = arr[0];
        for (int i = 1; i < num; i++) {
            if (Max < arr[i]) Max = arr[i];
        }
        return Max;
    }

    public static double min(double[] arr, int num) {
        double Min = arr[0];
        for (int i = 1; i < num; i++) {
            if (Min > arr[i]) Min = arr[i];
        }
        return Min;
    }

    public static double average(double[] arr, int num) {
        double sum = 0;
        for (int i = 0; i < num; i++) {
            sum += arr[i];
        }
        return sum / num;
    }

    public static double deviation(double[] arr, double aver, int num) {
        double sum = 0;
        for (int i = 0; i < num; i++) {
            sum += Math.pow(arr[i] - aver, 2);
        }
        return Math.sqrt(sum / (num - 1));
    }
}
