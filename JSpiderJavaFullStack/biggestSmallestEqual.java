import java.util.Scanner;

public class biggestSmallestEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        // equals
        if (a == b) {
            if (b == c) {
                System.out.println("First number " + a + " and Second number " + b + " and third number " + c
                        + " every thing is equal");
            } else {
                if (b > c) {
                    System.out.println("First number " + a + " and second number " + b
                            + " both are equal and third number  " + c + " is smaller than both of them");
                } else {
                    System.out.println("First number " + a + " and second number " + b
                            + " both are equal and third number" + c + " is larger than both of them");
                }
            }
        } else {
            if (b == c) {
                if (a > b) {
                    System.out.println("Second number " + b + " and third number " + c
                            + " both are equal and First number " + a + " is greater than both of them");
                } else {
                    System.out.println("Second number " + b + " and third number " + c
                            + "  both are equal and First number" + a + " is smaller than both of them");
                }
            } else {
                if (a > b) {
                    if (a > c) {
                        if (b > c) {
                            System.out.println("First number " + a + " is the greatest of three");
                            System.out.println("Second number " + b + " is the smaller or the middle one of three");
                            System.out.println("third number " + c + " is the smallest of three");

                        } else {
                            System.out.println("First number " + a + " is the greatest of three");
                            System.out.println("Third number " + c + " is the smaller or the middle one of three");
                            System.out.println("Second number " + b + " is the smallest of three");
                        }

                    } else {
                        System.out.println("Third number " + c + " is the greatest of three");
                        System.out.println("First number " + a + " is the smaller or the middle one of three");
                        System.out.println("Second number " + b + " is the smallest of three");
                    }

                } else {
                    if (b > c) {
                        if (a > c) {
                            System.out.println("Second number " + b + " is the greatest of three");
                            System.out.println("First number " + a + " is the smaller or the middle one of three");
                            System.out.println("Third number " + c + " is the smallest of three");
                        } else {
                            System.out.println("Second number " + b + " is the greatest of three");
                            System.out.println("Third number " + c + " is the smaller or the middle one of three");
                            System.out.println("First number " + a + " is the smallest of three");
                        }
                    } else {
                        System.out.println("Third number " + c + " is the greatest of three");
                        System.out.println("Second number " + b + " is the smaller or the middle one of three");
                        System.out.println("First number " + a + " is the smallest of three");
                    }

                }
            }

        }

        // greater cmaller smallest

        sc.close();
    }
}
