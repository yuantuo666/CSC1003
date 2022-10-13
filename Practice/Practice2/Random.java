/**
 * Problem 2
 * 
 * Write a program that prints the sum of two random integers between 1 and 6 (such as you 
 * might get when rolling dice). This program does not need the input. You can use the 
 * RandomInt program in the lecture notes as the reference.
 * 
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/09/27
 */
public class Random{
	public static void main(String[] args){
		int r1 = (int)(Math.random() * 6) + 1;
		int r2 = (int)(Math.random() * 6) + 1;
		int result = r1 + r2;
		System.out.println(result);
	}
}
