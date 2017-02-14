package com.github.solairerove.scala.theshit.lapa;

public class Laplace {

    public static void main(int N, int X, int Y) {
        int TRIALS = 100000;                   // number of trials
        int potential = 0;                     // sum of potentials

        for (int i = 0; i < TRIALS; i++) {
            int x = X, y = Y;
            while (x > 0 && x < N && y > 0 && y < N) {
                double r = Math.random();           // between 0.0 and 1.0
                if (r < 0.25) {
                    x++;
                } else if (r < 0.50) {
                    x--;
                } else if (r < 0.75) {
                    y++;
                } else {
                    y--;
                }
            }
            if (x == 0 || x == N) {
                potential += 10;
            } else {
                potential += 5;
            }
        }
        System.out.println("Potential of (" + X + ", " + Y + ") = " + 1.0 * potential / TRIALS);
    }
}
