package ChapterOne_Two;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Ex_1_2_3 {

    // TODO: 6/25/2020 no finished yet 
    public static void main(String[] args) {
        exercise(10, 0, 10);
    }

    public static void exercise(int N, int min, int max){
        for (int i = 0; i < N; i++) {
            createInterval(min, max).draw();
        }
    }

    public static Interval2D createInterval(int min, int max){
        Interval2D interval2D = new Interval2D(interval1DFactory(min, max),
                interval1DFactory(min, max));
        return interval2D;
    }

    public static Interval1D interval1DFactory(int min, int max){
        return new Interval1D(StdRandom.uniform(min, max),StdRandom.uniform(min, max));
    }
}

