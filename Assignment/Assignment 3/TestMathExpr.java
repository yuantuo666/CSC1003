/**
 * TestMathExpr
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/11/22
 */

import java.util.Scanner;

public class TestMathExpr {

    public static double parse(String str) {
//        System.out.println("> " + str);
        str = str.replaceAll(" ", "");
        if (str.length() == 0) return 0.0d;
        // check brackets
        int bracket = 0;

        for (int i = 0; i < str.length(); i++) {
            String c = str.substring(i, i + 1);
            // jump brackets
            if (c.equals("("))
                bracket++;
            if (c.equals(")"))
                bracket--;
        }
        if (bracket > 0)
            for (int i = 0; i < bracket; i++)
                str = str + ")";
        if (bracket < 0)
            for (int i = 0; i < -bracket; i++)
                str = "(" + str;
        bracket = 0;

        // judge if only brackets
        if (str.charAt(0) == '(' && str.endsWith(")")) {
            String sub = str.substring(1, str.length() - 1);
            for (int i = 0; i < sub.length(); i++) {
                String c = sub.substring(i, i + 1);
                // jump brackets
                if (c.equals("("))
                    bracket++;
                if (c.equals(")"))
                    bracket--;
                if (bracket < 0) break;
            }
            if (bracket == 0) return parse(sub);
        }
        bracket = 0;
        try {
            return Double.parseDouble(str);
        } catch (Exception error) {
//            System.out.println("> parse fail: " + str);
        }
        String[] functions = {"sin", "cos", "tan", "sqrt"};
        for (int i = 0; i < functions.length; i++) {
            int fn_length = functions[i].length();
            if (str.length() > fn_length + 2 && functions[i].equals(str.substring(0, fn_length))) {
                // find the left bracket
                for (int j = fn_length; j < str.length(); j++) {
                    String c = str.substring(j, j + 1);
                    // jump brackets
                    if (c.equals("("))
                        bracket++;
                    if (c.equals(")"))
                        bracket--;
                    if (bracket == 0) {
                        double temp = parse(str.substring(fn_length, j + 1));
                        switch (i) {
                            case 0:
                                return Math.sin(temp);
                            case 1:
                                return Math.cos(temp);
                            case 2:
                                return Math.tan(temp);
                            case 3:
                                return Math.sqrt(temp);
                        }
                    }
                }
            }
        }

        // add and minus partition
        String[] operation = new String[20];
        double[] partition = new double[20];
        // - 5 + 4
        // 5 + 4 - 6
        //0 1 2 3 4
        int index = 0;
        int last_i = -1;
        operation[0] = "+";
        bracket = 0;
        for (int i = 0; i < str.length(); i++) {
            String c = str.substring(i, i + 1);
            // jump brackets
            if (c.equals("(")) bracket++;
            if (c.equals(")")) bracket--;
            if (bracket != 0) continue;

            // handle
            if (c.equals("+") || c.equals("-")) {
                if (i == 0) {
                    operation[index] = c;
                    last_i = i;
                } else {
                    operation[index + 1] = c;
                    // save last part
                    partition[index] = parse(str.substring(last_i + 1, i));
                    last_i = i;
                    index++;
                }
            }
            if (i == str.length() - 1 && last_i != -1) partition[index] = parse(str.substring(last_i + 1, i + 1));
        }
        if (last_i == -1) {
            // no + or -
            // calculate * /
            String[] operation2 = new String[20];
            double[] partition2 = new double[20];
            last_i = -1;
            int index2 = 0;
            bracket = 0;
            operation2[0] = "*";
            for (int i = 0; i < str.length(); i++) {
                String c = str.substring(i, i + 1);
                // jump brackets
                if (c.equals("(")) bracket++;
                if (c.equals(")")) bracket--;
                if (bracket != 0) continue;

                // handle
                if (c.equals("*") || c.equals("/")) {
                    // save last part
                    operation2[index2 + 1] = c;
                    partition2[index2] = parse(str.substring(last_i + 1, i));

                    last_i = i;
                    index2++;
                }
                if (i == str.length() - 1 && last_i != -1)
                    partition2[index2] = parse(str.substring(last_i + 1, i + 1));
            }
            double result2 = 1.0d;
            for (int i = 0; i <= index2; i++) {
                if (operation2[i].equals("*"))
                    result2 *= partition2[i];
                if (operation2[i].equals("/"))
                    result2 /= partition2[i];
            }
            if (last_i != -1) {
                operation[0] = "+";
                partition[0] = result2;
            }
        }
        double result = 0.0d;
        for (int i = 0; i <= index; i++) {
            if (operation[i].equals("+"))
                result += partition[i];
            if (operation[i].equals("-"))
                result -= partition[i];
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            double result = parse(input.nextLine());
            System.out.println(Math.round(result));
        }
    }
}

