package chapter1_2;

import edu.princeton.cs.algs4.*;

import java.awt.*;

public class Ex03 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double min = StdIn.readDouble();
        double max = StdIn.readDouble();
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        StdDraw.setPenColor(Color.CYAN);

        Point2D[] leftTops = new Point2D[N];
        Point2D[] rightBottoms = new Point2D[N];
        Interval2D[] interval2DS = new Interval2D[N];

        for (int i = 0; i < N; i++) {
            double a = StdRandom.uniform(min, max);
            double b = StdRandom.uniform(min, max);
            double c = StdRandom.uniform(min, max);
            double d = StdRandom.uniform(min, max);

            double leftTopX, leftTopY, rightBottomX, rightBottomY;
            if (a >= b) {
                rightBottomX = a;
                leftTopX = b;
            } else {
                rightBottomX = b;
                leftTopX = a;
            }

            if (c >= d) {
                leftTopY = c;
                rightBottomY = d;
            } else {
                leftTopY = d;
                rightBottomY = c;
            }

            leftTops[i] = new Point2D(leftTopX, leftTopY);
            rightBottoms[i] = new Point2D(rightBottomX, rightBottomY);

            interval2DS[i] = new Interval2D(new Interval1D(leftTopX, rightBottomX),
                    new Interval1D(rightBottomY, leftTopY));

            interval2DS[i].draw();

        }

        int containNum = 0, intervalNum = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (interval2DS[i].intersects(interval2DS[j])) {
                    intervalNum++;
                    if (leftTops[i].x() <= leftTops[j].x() && leftTops[i].y() >= leftTops[j].y()
                            && rightBottoms[i].x() >= rightBottoms[j].x()
                            && rightBottoms[i].y() <= rightBottoms[i].y()
                    ) containNum++;
                    if (leftTops[i].x() >= leftTops[j].x() && leftTops[i].y() <= leftTops[j].y()
                            && rightBottoms[i].x() <= rightBottoms[j].x()
                            && rightBottoms[i].y() >= rightBottoms[i].y()
                    ) containNum++;
                }
            }
        }

        StdOut.println("Interval count: " + intervalNum);
        StdOut.println("Contain count: " + containNum);
    }

}

