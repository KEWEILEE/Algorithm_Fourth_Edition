package ChapterOne_Two;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdRandom;

public class Ex_1_2_2 {

    public static void main(String[] args) {
        int N = 10;
        Interval1D[] interval1DS = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            double high = 0;
            double low = 0;
            while (low >= high) {
                high = 10 * StdRandom.uniform();
                low = high * StdRandom.uniform();
            }

            interval1DS[i] = new Interval1D(low, high);
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (interval1DS[i].intersects(interval1DS[j])) {
                    System.out.println(interval1DS[i] + "------" + interval1DS[j]);
                }
            }
        }
    }

}
