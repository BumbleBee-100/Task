public class OddSeries{
    public static void main(String[] args){
        // for loop
        System.out.print("For:      ");
        for(int i=1;i<=19;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        // while loop
        System.out.print("While:    ");
        int i=1;
        while(i<=19){
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println();
        // do-while loop
        System.out.print("Do-While: ");
        int j=1;
        do{
            System.out.print(j+" ");
            j+=2;
        }while(j<=19);
        System.out.println();
    }
}