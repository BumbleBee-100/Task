import java.util.Scanner;
public class OddEvenCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd=0,even=0;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            if(val%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Odd: "+odd+", Even: "+even);
    }
}