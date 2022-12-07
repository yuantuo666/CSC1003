/**
 * TestMathExpr
 *
 * Write a java program named “TestMathExpr.java” to evaluate mathematical expressions
 * with two operands (nonnegative integers) and one operator (+, -, *, or /).
 *
 * @version 2022.10.04-22:11
 * @email 122090513@link.cuhk.edu.cn
 */
import java.util.*;
public class TestMathExpr {
    static Scanner input = new Scanner(System.in);

	public static void parse_line(String s1, String s2, String s3) {
        // 0th: parse input
        int int1 = Integer.parseInt(s1);
        int int2 = Integer.parseInt(s3);
        int r = 0;
        // 1st: execute operation
        switch (s2)
        {
            case "+":
                r = int1 + int2;
                break;
            case "-":
                r = int1 - int2;
                break;
            case "*":
                r = int1 * int2;
                break;
            case "/":
                if (int2 == 0)
                {
                    System.out.println("invalid");
                    return;
                }
                r = int1 / int2;
                break;
            default:
                System.out.println("invalid");
                return;
        }
        // 2nd: print out result
        System.out.println(r);
    }

    public static void main(String[] args) throws Exception {
        int line_number = Integer.parseInt(input.nextLine()); 
        for(int i = 0; i < line_number; i++) {
            String s = input.nextLine();
            String t[] = s.split(" ");
            TestMathExpr.parse_line(t[0], t[1], t[2]);
        }
    }
}