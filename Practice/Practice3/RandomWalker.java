/**
 * Problem 6
 * 
 * [Optional] 1D random walk simulation. A one-dimensional random walk simulates the 
 * behavior of a particle moving in a sequence of points. At each step, the random walker 
 * moves left or right with probability equal to 1/2, independent of previous moves. Write a
 * program RandomWalker that takes an integer command-line argument n and estimates 
 * how long it will take a random walker to hit the boundary of this sequence centered at the 
 * starting point with a length of 2n+1.
 * For example, the below figure is the case where n = 2, and p = 1/2. The walker starts at 0, 
 * and stops when she/he reaches -2 or 2.
 * 
 * @author yuantuo666 <yuantuo666@gmail.com>
 * @version 2022/10/13
 */
public class RandomWalker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int times = 0;

        int x = 0;
        while (x != n && x != -n) {
            if (Math.random() < 0.5)
                x--;
            else
                x++;
            times++;
        }
        System.out.println(times);
    }
}
