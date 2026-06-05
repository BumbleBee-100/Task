import java.util.Scanner;
public class FindMax{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double max=sc.nextDouble();
        for(int i=1;i<n;i++){
            double val=sc.nextDouble();
            if(val>max) max=val;
        }
        System.out.println("Max: "+max);
    }
}