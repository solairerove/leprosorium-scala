//package com.github.solairerove.scala.theshit.lapa;
//
//import java.awt.*;
//
//public class LaplaceSquare {
//
//    public static void main(String[] args) {
//        int N = Integer.parseInt(args[0]);
//        int SIZE = 3*N;
//        Picture pic = new Picture(SIZE+1, SIZE+1);
//        double[][] V = new double [SIZE+1][SIZE+1];
//
//        // precompute colors from blue to red
//        Color[] colors = new Color[101];
//        for (int i = 0; i <= 100; i++) {
//            int red = 255*i/100;
//            int green = 128;
//            int blue = 255*(100-i)/100;
//            colors[i] = new Color(red, green, blue);
//        }
//        // equipotentials in white for multiples of 10
//        for (int i = 0; i <= 100; i = i + 10)
//            colors[i] = Color.WHITE;
//
//
//        // initialize potentials with reasonable starting values
//        for (int i = 1; i <= SIZE/2; i++) {
//            for (int j = 1; j <= SIZE/2; j++) {
//                V[i][j] = 100.0 * (i + j) / (SIZE);
//                V[SIZE-i][j] = V[i][SIZE-j] = V[SIZE-i][SIZE-j] = V[i][j];
//            }
//        }
//
//        // inner boundary
//        for (int i = N; i < 2*N; i++)
//            for (int j = N; j < 2*N; j++)
//                V[i][j] = 100;
//
//
//
//        // numerically solve Laplace's equation
//        while(true) {
//
//            // repeat 100 times before drawing to screen
//            for (int t = 0; t < 100; t++) {
//                for (int i = 1; i < SIZE; i++) {
//                    for (int j = 1; j < SIZE; j++) {
//                        if (!(i >= N && i < 2*N && j >= N && j < 2*N))
//                            V[i][j] = 0.25* (V[i-1][j] + V[i+1][j] + V[i][j-1] + V[i][j+1]);
//                    }
//                }
//            }
//
//            // draw
//            for (int i = 0; i <= SIZE; i++) {
//                for (int j = 0; j <= SIZE; j++) {
//                    Color color = colors[(int) Math.round(V[i][j])];
//                    pic.set(i, N-1-j, color);
//                }
//            }
//            pic.show();
//        }
//    }
//}
