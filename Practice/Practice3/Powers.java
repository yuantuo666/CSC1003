/**
 * Problem 3
 * 
 * Write a program that takes an integer command-line argument n and prints all the positive 
 * powers of 3 less than or equal to n.
 * 
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/13
 */
public class Powers {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		int i = 1;
		int i3 = 1;
		while (n >= i3) {
			System.out.println(i3);
			i++;
			i3 = i * i * i;
		}
	}
}
