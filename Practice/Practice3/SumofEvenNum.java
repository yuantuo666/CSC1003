/**
 * Problem 1
 * 
 * Write a Java program to compute the sum of the first N positive even numbers. N can be 
 * input from the command argument. Suppose N = 2, then the sum will be 2 + 4 = 6. If N = 3, 
 * then the sum will be 2 + 4 + 6 = 12. You can use the following template to implement this 
 * Java program.
 * 
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/13
 */
public class SumofEvenNum {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int sum = 0;

		for (int i = 1; i <= N; i++) {
			sum += i * 2;
		}

		System.out.println(sum);
	}
}
