import java.util.Scanner;
public class CharCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char target=sc.next().charAt(0);
        int count=0;
        for(char c:s.toCharArray()){
            if(c==target) count++;
        }
        System.out.println("Count: "+count);
    }
}