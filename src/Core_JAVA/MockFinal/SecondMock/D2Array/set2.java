package MockFinal.SecondMock.D2Array;

import java.util.Random;

public class set2 {
    public static void main(String[] args) {

        Random rd = new Random();
        int [] [] a = new int[5][5];

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = rd.nextInt(100);
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        int [] [] b = new int[5][5];
//
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                b[i][j] = rd.nextInt(10);
//                System.out.print(b[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println();
        spiralMatrix(a);
    }
    private static void spiralMatrix(int [][] a){

        int top = 0, bottum = a.length - 1;
        int left = 0, right = a[0].length - 1;
        int num = 1;

        while (top <= bottum && left <= right){
            for (int i = left; i <= right; i++) {
                a[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottum; i++) {
                a[i][right] = num++;
            }
            right--;

            if (top <= bottum){
                for (int i = right; i >= left ; i--) {
                    a[bottum][i] = num++;
                }
                bottum--;
            }

            if (left <= right){
                for (int i = bottum; i >= top; i--) {
                    a[i][left] = num++;
                }
                left++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    private static void largestElement(int [][] a){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max){
                    secondMax = max;
                    max = a[i][j];
                } else if (a[i][j] > secondMax && a[i][j] < max) {
                    secondMax = a[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }

    private static void productOfMatrix(int [][] a, int [][] b){
        int [][] c = new int [a.length][b.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void diagonalSum(int [][] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j || i+j == a.length-1){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    private static void transpose(int [][] a) {
        int[][] b = new int[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void pascal(int [][] a){
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length-i; j++) {
                System.out.print(" ");
            }

            a[i] = new int[i+1];
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0){
                    a[i][j] = 1;
                }else{
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
                }

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
