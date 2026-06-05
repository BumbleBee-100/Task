class Wallet04{
    private static int counter=1;
    private final int id;
    private double balance;
    private String lastWithdrawMode="N/A";
    Wallet04(){
        this.id=counter++;
        this.balance=0.0;
    }
    Wallet04(double initialBalance){
        this.id=counter++;
        this.balance=(initialBalance>=0)?initialBalance:0.0;
    }
    void deposit(double amount){
        if(amount<=0){
            System.out.println("  [Wallet#"+this.id+"] Deposit amount must be positive.");
            return;
        }
        this.balance+=amount;
    }
    void withdraw(double amount){
        if(amount<=0){
            System.out.println("  [Wallet#"+this.id+"] Withdraw amount must be positive.");
            return;
        }
        if(amount>this.balance){
            System.out.println("  [Wallet#"+this.id+"] Insufficient funds.");
            return;
        }
        this.balance-=amount;
        this.lastWithdrawMode="NORMAL";
    }
    void withdraw(double amount,String mode){
        if(amount<=0){
            System.out.println("  [Wallet#"+this.id+"] Withdraw amount must be positive.");
            return;
        }
        if(amount>this.balance){
            System.out.println("  [Wallet#"+this.id+"] Insufficient funds for "+mode+" withdrawal.");
            return;
        }
        this.balance-=amount;
        this.lastWithdrawMode=mode.toUpperCase();
    }
    String getLastWithdrawMode(){
        return this.lastWithdrawMode;
    }
    double getBalance(){
        return this.balance;
    }
    int getId(){
        return this.id;
    }
    public String toString(){
        return "Wallet{id="+id+", balance="+balance+", lastMode="+lastWithdrawMode+"}";
    }
}
public class Task04{
    public static void main(String[] args){
        System.out.println("=== Task#04: Overloaded withdraw ===");
        Wallet04 w1=new Wallet04(600.0);
        Wallet04 w2=new Wallet04(800.0);
        System.out.println("Initial w1 : "+w1);
        System.out.println("Initial w2 : "+w2);
        w1.withdraw(100.0);
        System.out.println("w1 after withdraw(100)          : "+w1);
        System.out.println("  last mode query               : "+w1.getLastWithdrawMode());
        w2.withdraw(200.0,"ATM");
        System.out.println("w2 after withdraw(200, ATM)     : "+w2);
        System.out.println("  last mode query               : "+w2.getLastWithdrawMode());
        w2.withdraw(150.0,"ONLINE");
        System.out.println("w2 after withdraw(150, ONLINE)  : "+w2);
        System.out.println("  last mode query               : "+w2.getLastWithdrawMode());
        w1.withdraw(9999.0,"ATM");
        System.out.println("w1 after withdraw(9999, ATM)    : "+w1);
    }
}