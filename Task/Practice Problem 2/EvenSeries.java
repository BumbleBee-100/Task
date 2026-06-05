public class EvenSeries{
    public static void main(String[] args){
        // for loop
        System.out.print("For:      ");
        for(int i=2;i<=20;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        // while loop
        System.out.print("While:    ");
        int i=2;
        while(i<=20){
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println();
        // do-while loop
        System.out.print("Do-While: ");
        int j=2;
        do{
            System.out.print(j+" ");
            j+=2;
        }while(j<=20);
        System.out.println();
    }
}