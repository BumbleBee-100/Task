class Wallet03{
    private static int counter=1;
    private final int id;
    private double balance;
    Wallet03(){
        this.id=counter++;
        this.balance=0.0;
    }
    Wallet03(double initialBalance){
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
    }
    int getId(){
        return this.id;
    }
    double getBalance(){
        return this.balance;
    }
    public String toString(){
        return "Wallet{id="+id+", balance="+balance+"}";
    }
}
public class Task03{
    public static void main(String[] args){
        System.out.println("=== Task#03: Unique ID + Two Constructors ===");
        Wallet03 w1=new Wallet03();
        Wallet03 w2=new Wallet03(500.0);
        Wallet03 w3=new Wallet03(250.0);
        System.out.println("Created: "+w1);
        System.out.println("Created: "+w2);
        System.out.println("Created: "+w3);
        w1.deposit(150.0);
        System.out.println("w1 after deposit(150)   : "+w1);
        w2.withdraw(200.0);
        System.out.println("w2 after withdraw(200)  : "+w2);
        System.out.println("w1 id="+w1.getId()+" w2 id="+w2.getId()+" w3 id="+w3.getId());
        System.out.println("(Each id is unique and was auto-assigned at creation)");
    }
}