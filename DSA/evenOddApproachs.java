import java.util.Scanner; ;
public class evenOddApproachs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        if (n<0) {
            System.out.println("Invalid  input Enter number greater than 0");
        }
        //   arithmatical approach
        // if (n%2 == 0)
        // {
        //     System.out.println("Yes "+n+ " is even");   
        // }else{
        //     System.out.println("Yes "+n+ " is odd");   
            
     
        // }

        // Bit Masking approach : int his approachb we  perform bitwise and operation with the n number with 1
        //  (where & operation makes other 0 but if the lsb is 0 means it is positive if it is one it is odd )it makes the 
        if ((n & 1) == 0) {
            System.out.println("Yes " + n + " is even");
        } else {
            System.out.println("Yes " + n + " is odd");
        }
        sc.close();
    }
}
