package ChapterOne_Two;

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_2_5 {
    public static void main(String[] args) {
        String s = "Hello World";
        s.toUpperCase(); //no effect
        s.substring(6, 11); // no
        StdOut.println(s); //Hello World

        s = s.toUpperCase();
        s = s.substring(6, 11);
        StdOut.println(s);
    }
}
