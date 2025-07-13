import java.util.Scanner;
import java.util.Random;
public class checkIfTheArrayIsSorted {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Random rd = new Random(20);

System.out.println("Enter the Size of the Array : ");
int n = sc.nextInt();
int[]arr = new int[n];
for (int i = 0; i < n ; i++) {
    arr[i] = rd.nextInt(100);
    System.out.println(arr[i]);
}
sc.close();
    }
    
}
