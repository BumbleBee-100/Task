import java.util.Scanner;
public class HeronsFormula{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double s=(a+b+c)/2.0;
        System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}