public class bankBalance {
    public static void main(String [] args){
encapsulationTest1 test = new encapsulationTest1();
test.setBalance(1000);
        System.out.println(test.getBalance());
test.setAccountNumber(410480433342l);
        System.out.println(test.getAccountNumber());
        test.deposit(1000);
        test.withdraw(2000);
    }
}
