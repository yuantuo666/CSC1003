import java.util.Scanner;

/**
 * Problem
 *
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/11/11
 */

public class AsciiArt {
    public static Scanner in = new Scanner(System.in);
    public static String[][] art = {{"   ###   ", "  ## ##  ", " ##   ## ", "##     ##", "#########", "##     ##", "##     ##",}, {"######## ", "##     ##", "##     ##", "######## ", "##     ##", "##     ##", "######## ",}, {" ###### ", "##    ##", "##      ", "##      ", "##      ", "##    ##", " ###### ",}, {"######## ", "##     ##", "##     ##", "##     ##", "##     ##", "##     ##", "######## ",}, {"########", "##      ", "##      ", "######  ", "##      ", "##      ", "########",}, {"########", "##      ", "##      ", "######  ", "##      ", "##      ", "##      ",}, {" ######  ", "##    ## ", "##       ", "##   ####", "##    ## ", "##    ## ", " ######  ",}, {"##     ##", "##     ##", "##     ##", "#########", "##     ##", "##     ##", "##     ##",}, {"####", " ## ", " ## ", " ## ", " ## ", " ## ", "####",}, {"      ##", "      ##", "      ##", "      ##", "##    ##", "##    ##", " ###### ",}, {"##    ##", "##   ## ", "##  ##  ", "#####   ", "##  ##  ", "##   ## ", "##    ##",}, {"##      ", "##      ", "##      ", "##      ", "##      ", "##      ", "########",}, {"##     ##", "###   ###", "#### ####", "## ### ##", "##     ##", "##     ##", "##     ##",}, {"##    ##", "###   ##", "####  ##", "## ## ##", "##  ####", "##   ###", "##    ##",}, {" ####### ", "##     ##", "##     ##", "##     ##", "##     ##", "##     ##", " ####### ",}, {"######## ", "##     ##", "##     ##", "######## ", "##       ", "##       ", "##       ",}, {" ####### ", "##     ##", "##     ##", "##     ##", "##  ## ##", "##    ## ", " ##### ##",}, {"######## ", "##     ##", "##     ##", "######## ", "##   ##  ", "##    ## ", "##     ##",}, {" ###### ", "##    ##", "##      ", " ###### ", "      ##", "##    ##", " ###### ",}, {"########", "   ##   ", "   ##   ", "   ##   ", "   ##   ", "   ##   ", "   ##   ",}, {"##     ##", "##     ##", "##     ##", "##     ##", "##     ##", "##     ##", " ####### ",}, {"##     ##", "##     ##", "##     ##", "##     ##", " ##   ## ", "  ## ##  ", "   ###   ",}, {"##      ##", "##  ##  ##", "##  ##  ##", "##  ##  ##", "##  ##  ##", "##  ##  ##", " ###  ### ",}, {"##     ##", " ##   ## ", "  ## ##  ", "   ###   ", "  ## ##  ", " ##   ## ", "##     ##",}, {"##    ##", " ##  ## ", "  ####  ", "   ##   ", "   ##   ", "   ##   ", "   ##   ",}, {"########", "     ## ", "    ##  ", "   ##   ", "  ##    ", " ##     ", "######## "}};

    public static void main(String[] args) {
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) { // repeat n times
            // read space
            in.nextLine();
            // reading the character
            String[] line = new String[7];
            String characters="";
            for (int j = 0; j < 7; j++) { // the height of the character is 7
                line[j] = in.nextLine();
            }
            int start = 0;
            while (start < line[0].length()) {
                // split the character
                int width = 4;
                jump2:
                for (; width <= 10; width++) { // the weight of the character is from 4 to 10
                    for (int j = 0; j < 7; j++) {// the height of the character is 7
                        String sub = line[j].substring(start + width, start + width + 1);
                        if (sub.equals("#")) {
                            continue jump2;
                        }
                    }
                    break;
                }
                String character = recongize(line, start, width);
                start = start + width + 1;
                characters += character;
            }
            System.out.println(characters);
        }
    }

    public static String recongize(String[] line, int start, int width) {
        jump:
        for (int i = 0; i < art.length; i++) {
            // judge the length
            if (art[i][0].length() != width) continue;
            // judge the content
            for (int j = 0; j < 7; j++) { // the height of the character is 7
                for (int k = 0; k < width; k++) {
                    String sub1 = art[i][j].substring(k, k + 1);
                    String sub2 = line[j].substring(start + k, start + k + 1);
                    if (!sub1.equals(sub2)) {
                        // jump to next character
                        continue jump;
                    }
                }
            }
            // found
            char result = (char) (65 + i);
            return "" + result;
        }
        return "<unknown>";
    }
}
