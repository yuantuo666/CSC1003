/**
 * Problem 3
 * 
 * [Optional] Order check. Write a program that takes three double command-line 
 * arguments x, y, and z and prints true if the values are strictly ascending or descending ( x < 
 * y < z or x > y > z ), and false otherwise.
 * 
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/09/29
 */
public class Rank{
	public static void main(String[] args){
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double z = Double.parseDouble(args[2]);
		boolean r = false;
		if ((x > y && y > z) || (x < y && y < z)) r = true;
		System.out.println(r);
	}
}
