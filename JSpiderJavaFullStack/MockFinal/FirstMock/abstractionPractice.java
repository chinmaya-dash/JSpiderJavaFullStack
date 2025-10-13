package JSpiderJavaFullStack.MockFinal.FirstMock;

interface bankATM{
    void withdraw(double Amount);
    void deposite(double Amount);
    void balance();
}
class SBI implements bankATM{
    private double balance = 2000;

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("SBI: Withdrawn " + amount);
        } else {
            System.out.println("SBI: Insufficient balance!");
        }
    }

    @Override
    public void deposite(double Amount) {
            balance+=Amount;
        System.out.println("deposited ammount is : "+Amount);
    }

    @Override
    public void balance() {
        System.out.println("Total balance is : "+balance);
    }
}
class Axis implements bankATM{
    private double balance = 5000;

    @Override
    public void withdraw(double Amount) {
        if (Amount>balance){

            System.out.println("Balance is insufficient");
        }
        else {
            balance-=Amount;
            System.out.println("Remaining balance : "+balance);
        }
    }

    @Override
    public void deposite(double Amount) {
        balance+=Amount;
        System.out.println("deposited ammount is : "+Amount);
    }

    @Override
    public void balance() {
        System.out.println("Total balance is : "+balance);
    }
}
public class abstractionPractice {
public static void main(String[] arg){
    bankATM b = new SBI();
    b.withdraw(1200);
    b.deposite(1389);
    b.balance();
    bankATM a = new Axis();
    a.withdraw(5000);
    a.deposite(1209867345);
    a.balance();
}

}
