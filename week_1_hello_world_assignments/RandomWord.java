/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package week_1_hello_world_assignments;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int index = 0;
        String result = "";
        while (!StdIn.isEmpty()) {
            index++;
            String value = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / (double) index)) {
                result = value;
            }
        }
        StdOut.println(result);
    }
}
