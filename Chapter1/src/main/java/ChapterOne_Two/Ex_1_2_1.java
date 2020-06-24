package ChapterOne_Two;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import javafx.util.Pair;

public class Ex_1_2_1 {

    public static void main(String[] args) {
        int N = 10;
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);
        StdDraw.setPenRadius(0.05);
        StdDraw.enableDoubleBuffering();

        //N random numbers
        Point2D[] point2DS = new Point2D[N];
        for (int i = 0; i < N; i++) {
            point2DS[i] = new Point2D(StdRandom.uniform(100), StdRandom.uniform(100));
            point2DS[i].draw();
        }

        Pair<Point2D, Point2D> pair = new Pair<>(point2DS[0], point2DS[1]);
        double min = point2DS[0].distanceTo(point2DS[1]);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (point2DS[i].distanceTo(point2DS[j]) < min) {
                    min = point2DS[i].distanceTo(point2DS[j]);
                    pair = new Pair<>(point2DS[i], point2DS[j]);
                }
            }
        }

        pair.getKey().drawTo(pair.getValue());
        StdDraw.show();
    }
}
