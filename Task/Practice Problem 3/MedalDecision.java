import java.util.Scanner;
public class MedalDecision{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double gpa=sc.nextDouble();
        boolean done=sc.nextBoolean();
        if(done){
            if(gpa>=3.5){
                System.out.println("Medal awarded!");
            }else{
                System.out.println("No medal (grade below 3.5).");
            }
        }else{
            System.out.println("No medal (semester not completed).");
        }
    }
}