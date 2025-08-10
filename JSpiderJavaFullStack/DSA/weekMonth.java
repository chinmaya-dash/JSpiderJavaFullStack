import java.util.Scanner;

public class weekMonth {
    static void week(int n) {

    }

    static void Month(int n) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which year data you want");
        int m = sc.nextInt();
        System.out.println("Enter which month data you want");
        int n = sc.nextInt();
        // for months in year
        switch (n) {
            case 1:

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:
                System.out.println(n + " month is of 31 days");

                break;

            case 4:

            case 6:

            case 9:

            case 11:

                System.out.println(n + " month is of 30 days");

                break;
            case 2:
                if (m % 4 == 0 && m % 100 == 0) {
                    System.out.println("This month is of 29 dys");
                } else {
                    System.out.println("This month is of 28 dys");

                }
            default:
                break;
        }

        // for days in week
        // switch (n) {
        // case 1:
        // System.out.println("Sunday");
        // break;
        // case 2:
        // System.out.println("Monday");
        // break;
        // case 3:
        // System.out.println("TuesDay");
        // break;
        // case 4:
        // System.out.println("wednesday");
        // break;
        // case 5:
        // System.out.println("thursday");
        // break;
        // case 6:
        // System.out.println("friday");
        // break;
        // case 7:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("Invalid Input");
        // break;
        // }

        sc.close();
    }
}
