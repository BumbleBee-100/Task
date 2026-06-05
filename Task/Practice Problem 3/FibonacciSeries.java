import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<count;i++){
            System.out.print(a+(i<count-1?", ":"\n"));
            int tmp=a+b;
            a=b;
            b=tmp;
        }
    }
}