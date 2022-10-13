/**
 * Problem 2
 * 
 * Write a Java program to compute the greatest common divisor of two given positive 
 * integers A and B. You can assume the two positive integers are not larger than 1,000,000. 
 * For example, the highest common factor of 54 and 24 is 6. 
 * Hint: You can use for/while loop(s) and if statement(s) to write this program.
 * 
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/13
 */
public class CommonFactor {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);

		int min;
		if (n1 >= n2)
			min = n2;
		else
			min = n1;

		int MaxFactor = 1;

		for (int i = 1; i <= min; i++) { // Here can improve: from another direction to calculate
			if (n1 % i == 0 && n2 % i == 0)
				MaxFactor = i;
		}
		System.out.println(MaxFactor);
	}
}
