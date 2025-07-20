public class encapsulationTest1 {

   private long accountNumber;
   private double balance;

   public long getAccountNumber() {
      return accountNumber;
   }

   public void setAccountNumber(long accountNumber) {
      this.accountNumber = accountNumber;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   public void deposit(double amount){
if (amount>0) {
    balance+=amount;
    System.out.println("After deposit of Amount : "+amount+" Total Balance : "+balance);
}
else{
    System.out.println("Invalid Ammount");

}
   }
   public void withdraw(double amount){
    if (amount>0 && amount<=balance) {
        balance-=amount;
     System.out.println("After withdraw of Amount : "+amount+" Total Balance remaining : "+balance);

    }
    else{
        System.out.println("Invalid Ammount or Insufficient balance");
    }
   }
}