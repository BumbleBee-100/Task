import java.util.Scanner;
public class EquilateralTriangleArea{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double arm=sc.nextDouble();
        System.out.println((Math.sqrt(3)/4)*arm*arm);
    }
}