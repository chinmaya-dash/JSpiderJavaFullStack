public class strongnumber {
    public static void main(String[] args) {

        long num = 1000l;

        for (int i = 1; i <= num; i++) {
            int n = i;
            int sum = 0;
            while (n > 0) {
                long fact = 1;
                int digit = n % 10;
                for (int j = 1; j <= digit; j++) {
                    fact *= j;
                }
                sum += fact;
                n /= 10;
            }
            if (i == sum) {
                System.out.println("Yes " + i + " is a strong number");
            }
        }
    }
}
