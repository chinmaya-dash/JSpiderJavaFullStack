import java.util.Scanner;

public class MarriageAgeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Don't even think about it 🤬");
        } else if (age >= 18 && age <= 30) {
            System.out.println("Focus on your career 👈");
        } else if (age > 30 && age <= 45) {
            System.out.println("This is the best time for marriage. Go ahead 😊");
        } else {
            System.out.println("You may consider staying single or pursuing a peaceful life 😤");
        }
        sc.close();
    }
}
