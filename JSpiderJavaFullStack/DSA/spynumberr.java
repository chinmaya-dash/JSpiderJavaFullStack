public class spynumberr {
    public static void main(String[] args) {
        int n = 1000;

        for (int i = 0; i <= n; i++) {
            int temp = i;
            int sum = 0;
            int product = 1;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                product *= digit;
                temp /= 10;
            }
            if (sum == product) {
                System.out.println(i + " is a spy number");
            }
            // System.out.println(temp);
        }

    }
}
