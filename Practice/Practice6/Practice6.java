/**
 * Practice 6
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/31
 */

public class Practice6 {
    /*
     * 1. Write a static method max3() that takes three int arguments and returns the value of the
     *    largest one. Add an overloaded function that does the same thing with three double values.
     */
    public static int max3(int int1, int int2, int int3) {
        int max = 0;
        if (int1 > int2) max = int1;
        else max = int2;
        if (int3 > max) max = int3;
        return max;
    }

    public static double max3(double d1, double d2, double d3) {
        double max = 0;
        if (d1 > d2) max = d1;
        else max = d2;
        if (d3 > max) max = d3;
        return max;
    }

    /*
     * 2. Write a static method lg() that takes a double argument n and returns the base-2
     *    logarithm of n. You may use Java’s Math library.
     *    Hint: the API for Java's Math library can be found via the link
     *    https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
     */
    public static double lg(double n) {
        double lgn = Math.log10(n);
        double lg2 = Math.log10(2);
        return lgn / lg2;
    }

    /*
     * 3. Write a static method lg() that takes an int argument n and returns the largest integer not
     *    larger than the base-2 logarithm of n.
     *    Hint: Do not use the Math library
     */
    public static int lg(int n) {
        if (n == 1) return 0;
        int i = 0;
        for (; i < n + 1; i++) {
            if (pow(2, i) > n) break;
        }
        return i - 1;
    }

    public static int pow(int n, int times) {
        int result = n;
        for (int i = 1; i < times; i++) {
            result = result * n;
        }
        return result;
    }

    /*
     * 4. Write a static method any() that takes a boolean array as its argument and returns true if
     *    any of the elements in the array is true, and false otherwise. Write a static
     *    method all() that takes an array of boolean values as its argument and returns true if all
     *    of the elements in the array are true, and false otherwise
     */
    public static boolean any(boolean[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i]) return true;
        }
        return false;
    }

    public static boolean all(boolean[] a) {
        for (int i = 0; i < a.length; i++) {
            if (!a[i]) return false;
        }
        return true;
    }

    /*
     * 5. Write a static method reverse() that takes an array of integers (int) as its argument and
     *    returns a new array with the integers in reverse order. (Do not change the order of the ints
     *    in the argument array.)
     */
    public static void reverse(int[] a) {
        for (int i = 0; i < a.length; i++) {
            String s = "" + a[i];
            String[] sa = s.split("");
            String r = "";
            for (int j = sa.length - 1; j >= 0; j--) {
                r = r + sa[j];
            }
            a[i] = Integer.parseInt(r);

        }
    }
    /*
     * 6. HelloHelloByeByeByeByeByeByeByeBye
     */

    public static void main(String[] args) {
        System.out.println(max3(5, 9, 10));
        System.out.println(max3(5.5, 9.9, 10.01));
        System.out.println(lg(1024.0));
        System.out.println(lg(9));
        boolean[] test = {true, false, true, true};
        System.out.println(any(test));
        System.out.println(all(test));
        boolean[] test2 = {true, true, true, true};
        System.out.println(any(test2));
        System.out.println(all(test2));
        boolean[] test3 = {false, false, false, false};
        System.out.println(any(test3));
        System.out.println(all(test3));

        int[] r = {123, 245, 34, 56};
        reverse(r);
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println();
    }


}
