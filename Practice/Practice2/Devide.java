/**
 * Problem 1
 * 
 * Write a program that takes two positive integers as command-line arguments and prints 
 * true if either evenly divides the other. You might need % (to check divisible) and boolean 
 * operations. (You can use the LeapYear test program in the lecture notes as the reference.)
 * 
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/09/27
 */
public class Devide{
	public static void main(String[] args){
		int int1 = Integer.parseInt(args[0]);
		int int2 = Integer.parseInt(args[1]);
		boolean isDevisible = (int1 % int2 == 0) || (int2 % int1 == 0);
		System.out.println(isDevisible);
	}
}
