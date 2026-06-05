class Wallet05{
    private static int counter=1;
    private final int id;
    private double balance;
    private String lastWithdrawMode="N/A";
    Wallet05(){
        this.id=counter++;
        this.balance=0.0;
    }
    Wallet05(double initialBalance){
        this.id=counter++;
        this.balance=(initialBalance>=0)?initialBalance:0.0;
    }
    void deposit(double amount){
        if(amount<=0) return;
        this.balance+=amount;
    }
    void withdraw(double amount){
        if(amount<=0 || amount>this.balance) return;
        this.balance-=amount;
        this.lastWithdrawMode="NORMAL";
    }
    void withdraw(double amount,String mode){
        if(amount<=0 || amount>this.balance) return;
        this.balance-=amount;
        this.lastWithdrawMode=mode.toUpperCase();
    }
    static void addBonus(Wallet05 w,double amount){
        if(amount<=0){
            System.out.println("  addBonus: amount must be positive.");
            return;
        }
        w.balance+=amount;
        System.out.println("  addBonus("+amount+") → Wallet#"+w.id+" new balance: "+w.balance);
    }
    static void trySwap(Wallet05 a,Wallet05 b){
        Wallet05 temp=a;
        a=b;
        b=temp;

        System.out.println("  Inside trySwap(): a="+a+" b="+b);
    }
    int getId(){
        return id;
    }
    double getBalance(){
        return balance;
    }
    public String toString(){
        return "Wallet{id="+id+", balance="+balance+"}";
    }
}
public class Task05{
    public static void main(String[] args){
        System.out.println("=== Task#05: addBonus() + Reference Swap ===");
        Wallet05 w1=new Wallet05(300.0);
        Wallet05 w2=new Wallet05(500.0);
        System.out.println("Initial w1 : "+w1);
        System.out.println("Initial w2 : "+w2);
        System.out.println();
        System.out.println("--- addBonus() calls ---");
        Wallet05.addBonus(w1,100.0);
        Wallet05.addBonus(w2,50.0);
        System.out.println("After bonuses → w1: "+w1+" w2: "+w2);
        System.out.println();
        System.out.println("--- Reference swap inside a helper method ---");
        System.out.println("Before trySwap(): w1="+w1+" w2="+w2);
        Wallet05.trySwap(w1,w2);
        System.out.println("After  trySwap(): w1="+w1+" w2="+w2);
        System.out.println("  → w1 and w2 are UNCHANGED in main().");
        System.out.println("  → Java passes the reference by value.");
        System.out.println();
        System.out.println("--- Direct swap in main() ---");
        System.out.println("Before swap: w1="+w1+" w2="+w2);
        Wallet05 temp=w1;
        w1=w2;
        w2=temp;
        System.out.println("After  swap: w1="+w1+" w2="+w2);
        System.out.println("  → Works here because we are directly reassigning");
    }
}