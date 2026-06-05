import java.util.Scanner;
public class BallVolume{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        System.out.println((4.0/3.0)*Math.PI*r*r*r);
    }
}