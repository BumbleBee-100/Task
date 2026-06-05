import java.util.Scanner;
public class BonusCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double salary=sc.nextDouble();
        double sales=sc.nextDouble();
        double attend=sc.nextDouble();
        double rate;
        if(sales>=95 && attend==100){
            rate=0.60;
        }else if(sales>=95 && attend>=90){
            rate=0.40;
        }else if(sales>=80 && attend==100){
            rate=0.40;
        }else if(sales>=80 && attend>=90){
            rate=0.20;
        }else{
            rate=0.05;
        }
        System.out.println("Bonus: "+(salary*rate));
    }
}