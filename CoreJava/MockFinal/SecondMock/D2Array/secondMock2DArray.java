package MockFinal.SecondMock.D2Array;

import java.util.Random;
import java.util.Scanner;

public class secondMock2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = 5;
        int[][] a = new int[n][n];
        arrayShow(a);
        spiralMatrix(a);
        arrayShow(a);

    }

    private static void spiralMatrix(int[][] a) {

        int top = 0, down = a.length-1;
        int left = 0, right = a[0].length - 1;

        int num = 1;

        while (top <= down && left <= right){
//            first we traverse from left to right where top is same i changes
            for (int i = left; i <= right; i++) {
                a[top][i] = num++;
            }
            top++;

//            second we traverse from top to down where i changes and right is same
            for (int i = top; i <= down; i++) {
                a[i][right] = num++;
            }
            right--;

//            we traverse from right to left where bottum is same i changes
            if (top <= down){
                for (int i = right; i >= left ; i--) {
                    a[down][i] = num++;
                }
                down--;
            }

//            we traverse from down to top where i changes left is same
            if (left <= right){
                for (int i = down; i >= top ; i--) {
                    a[i][left] = num++;
                }
            left++;
            }
        }
    }

    private static void transposeMatrix(int[][] a){
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
    private  static void pascalTraangle(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                    a[i][j] = 1;
                }else{
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
                }

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

//
//    static void pascalTraangle(int [][] pascal){
//        for (int i = 0; i < pascal.length; i++) {
//            for (int j = 0; j < pascal.length-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                if (j == 0 || j == i)
//                    pascal[i][j] = 1;
//                else
//                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
//                System.out.print(pascal[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    static void fillSpiral(int[][] a) {
//        int n = a.length;
//        int m = a[0].length;
//
//        int top = 0, bottom = n - 1;
//        int left = 0, right = m - 1;
//        int num = 1;
//
//        while (top <= bottom && left <= right) {
//            // left → right
//            for (int i = left; i <= right; i++)
//                a[top][i] = num++;
//            top++;
//
//            // top → bottom
//            for (int i = top; i <= bottom; i++)
//                a[i][right] = num++;
//            right--;
//
//            // right → left
//            if (top <= bottom) {
//                for (int i = right; i >= left; i--)
//                    a[bottom][i] = num++;
//                bottom--;
//            }
//
//            // bottom → top
//            if (left <= right) {
//                for (int i = bottom; i >= top; i--)
//                    a[i][left] = num++;
//                left++;
//            }
//        }
//    }
//
    private static void arrayShow(int [][] a){
        Random rd = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
//                a[i][j] = rd.nextInt(100);
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("````````````````````````````````````````````````````````````");
    }
}
