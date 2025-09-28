package DSA.Arrays.twoDayArray;

import java.util.Random;
import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int row = sc.nextInt();
        int column = sc.nextInt();
        // int[][] a = new int[row][column];
        // int[][] b = new int[row][column];
        // int[][] c = new int[row][column];

        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
        //         // c[i][j] = (a[i][j] = rd.nextInt(100)) + (b[i][j] = rd.nextInt(100));
        //        a[i][j] = rd.nextInt(10);
        //     }
        // }
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
        //         // c[i][j] = (a[i][j] = rd.nextInt(100)) + (b[i][j] = rd.nextInt(100));
        //        b[i][j] = rd.nextInt(100);
        //     }
        // }

        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
        //         System.out.print(c[i][j] + " ");
        //     }
        //     System.out.println();
        // }
int[][] a ={{1,2,1}, {3,5,4}, {2,3,1}};
int [][] b = {{1,2,4}, {4,2,1}, {1,1,1}};
        matrixmultiplication(a, b);
        sc.close();
    }

    static void matrixmultiplication(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
         for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// Assignment
// wajp to print second min element in given 2d Arrays
// wajp to print 2nd max element in 2d Arrays