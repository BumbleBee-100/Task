public class SeriesSum{
    public static void main(String[] args){
        int sumEven=0,sumOdd=0;
        for(int i=2;i<=20;i+=2){
            sumEven+=i;
        }
        for(int i=1;i<=19;i+=2){
            sumOdd+=i;
        }
        System.out.println("Sum of even series: "+sumEven);
        System.out.println("Sum of odd  series: "+sumOdd);
    }
}