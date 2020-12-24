package chapter1_2;

import edu.princeton.cs.algs4.StdDraw;

public class Ex10 {
    public static class VisualCounter {
        private int numOfvalue;
        private int numOfexc;
        private int N;
        private int M;

        VisualCounter(int N, int M) {
            this.N = N;
            this.M = M;
            StdDraw.setXscale(0, N);
            StdDraw.setYscale(-M, M);
            StdDraw.setPenRadius(0.01);
            StdDraw.point(0, 0);
        }

        public void increment() {
            if (numOfvalue <= M && numOfexc <= N) {
                numOfvalue++;
                numOfexc++;
                StdDraw.point(numOfexc, numOfvalue);
            }
        }

        public void decrement() {
            if (numOfvalue <= M && numOfexc <= N) {
                numOfvalue--;
                numOfexc++;
                StdDraw.point(numOfexc, numOfvalue);
            }
        }

    }
    
    public static void main(String[] args) {
        VisualCounter counter = new VisualCounter(100, 100);
        for (int i = 0; i < 100; i++) {
            counter.increment();
        }
    }
}
