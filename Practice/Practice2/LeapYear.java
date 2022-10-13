/**
 * LeapYear test program
 * 
 * @version 2022/09/29
 */
public class LeapYear{
	public static void main(String[] args){
		int year = Integer.parseInt(args[0]);
		boolean isLeapYear;
		isLeapYear = ((year % 4 ==0) && (year % 100 != 0)) || (year % 400 == 0);
		System.out.println(isLeapYear);
	}
}
