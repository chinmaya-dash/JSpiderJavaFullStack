package DSA.sortingTest;

public class numbertiword {
    public class NumToWord {
    public static void main(String[] args) {
        int num = 98767876;

        convert(num / 10000000, " crore ");
        convert((num / 100000) % 100, " lakhs ");
        convert((num / 1000) % 100, " thousand ");
        convert((num / 100) % 10, " Hundred ");
        convert(num % 100, "");
    }

    public static void convert(int n, String s) {
        String[] one = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                         "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                         "seventeen", "eighteen", "nineteen" };

        String[] ten = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
                         "Eighty", "Ninety" };

        if (n < 19)
            System.out.print(one[n] + " ");
        else
            System.out.print(ten[n / 10] + " " + one[n % 10] + " ");

        if (n != 0)
            System.out.print(s);
    }
}
}
