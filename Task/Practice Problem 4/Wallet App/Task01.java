public class Task01{
    static double deposit(double balance,double amount){
        if(amount<=0){
            System.out.println("  Deposit amount must be positive.");
            return balance;
        }
        return balance+amount;
    }
    static double withdraw(double balance,double amount){
        if(amount<=0){
            System.out.println("  Withdraw amount must be positive.");
            return balance;
        }
        if(amount>balance){
            System.out.println("  Insufficient funds.");
            return balance;
        }
        return balance-amount;
    }
    public static void main(String[] args){
        double balance_1=500.0;
        double balance_2=300.0;
        System.out.println("=== Task#01: Procedural Wallet ===");
        System.out.println("Initial balance_1 : "+balance_1);
        System.out.println("Initial balance_2 : "+balance_2);
        balance_1=deposit(balance_1,200.0);
        System.out.println("balance_1 after deposit(200)  : "+balance_1);
        balance_2=withdraw(balance_2,100.0);
        System.out.println("balance_2 after withdraw(100) : "+balance_2);
        balance_1=withdraw(balance_1,800.0);
        System.out.println("balance_1 after withdraw(800) : "+balance_1);
    }
}