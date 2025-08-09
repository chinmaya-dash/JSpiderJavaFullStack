import java.util.Random;
import java.util.Scanner;

public class MaxInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements in the array: ");
        int n = sc.nextInt();
        Random rd = new Random(100);
        int arr[] = new int[n];

        int max = arr[0];

        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");

            if (max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The maximum in the aarray  : "+max);
        sc.close();
    }
    
}
