class Wallet02{
    private double balance;
    Wallet02(double initialBalance){
        this.balance=(initialBalance>=0)?initialBalance:0.0;
    }
    void deposit(double amount){
        if(amount<=0){
            System.out.println("  Deposit amount must be positive.");
            return;
        }
        this.balance+=amount;
    }
    void withdraw(double amount){
        if(amount<=0){
            System.out.println("  Withdraw amount must be positive.");
            return;
        }
        if(amount>this.balance){
            System.out.println("  Insufficient funds.");
            return;
        }
        this.balance-=amount;
    }
    double getBalance(){
        return this.balance;
    }
    @Override
    public String toString(){
        return "Wallet{balance="+this.balance+"}";
    }
}
public class Task02{
    public static void main(String[] args){
        System.out.println("=== Task#02: OOP Wallet ===");
        Wallet02 w1=new Wallet02(500.0);
        Wallet02 w2=new Wallet02(300.0);
        System.out.println("Initial w1 : "+w1);
        System.out.println("Initial w2 : "+w2);
        w1.deposit(200.0);
        System.out.println("w1 after deposit(200)  : "+w1);
        w2.withdraw(100.0);
        System.out.println("w2 after withdraw(100) : "+w2);
        w1.withdraw(9999.0);
        System.out.println("w1 after withdraw(9999): "+w1);
    }
}