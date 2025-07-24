public class ______prime {
    public static void main(String[] args) {
        int n = 5;
        boolean bool = true;
      if (n<1) {
        System.out.println(" invalid input");
      }else{
      for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                bool = false;
            }
        }
        if (bool) {
            System.out.println(n + " it is prime");
        } else {
            System.out.println(n + " not prrime");
        }
    }
}
}
