import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
// flat if&elseif
     
    //    if (year % 400 == 0) {
    //         System.out.println("Leap Year");
    //     } else if (year % 100 == 0) {
    //         System.out.println("Not a Leap Year");
    //     } else if (year % 4 == 0) {
    //         System.out.println("Leap Year");
    //     } else {
    //         System.out.println("Not a Leap Year");
    //     }

// nested if
    if (year % 400 == 0) {
    System.out.println("Leap Year");
} else {
    if (year % 4 == 0 && year % 100 != 0) {
        System.out.println("Leap Year");
    } else {
        System.out.println("Not a Leap Year");
    }
}

        sc.close();
    }
    
}
