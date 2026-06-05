public class b_Restaurant{
    static class Restaurant{
        String name;
        Restaurant(String name){
            this.name=name;
        }
        double calculateTotalBill(double foodPrice){
            return foodPrice+foodPrice*0.10;
        }
        int estimateDeliveryTime(){
            return 40;
        }
        void printDetails(double price){
            System.out.printf("[%-20s] Bill: $%.2f Delivery: %d mins%n",
                    name,calculateTotalBill(price),estimateDeliveryTime());
        }
    }
    static class FastFoodRestaurant extends Restaurant{
        FastFoodRestaurant(String name){
            super(name);
        }
        @Override
        double calculateTotalBill(double p){
            return p+p*0.15;
        }
        @Override
        int estimateDeliveryTime(){
            return 20;
        }
    }
    static class FineDiningRestaurant extends Restaurant{
        FineDiningRestaurant(String name){
            super(name);
        }
        @Override
        int estimateDeliveryTime(){
            return 60;
        }
    }
    public static void main(String[] args){
        Restaurant[] restaurants={
            new Restaurant("Bistro"),
            new FastFoodRestaurant("Burger Barn"),
            new FineDiningRestaurant("Le Gourmet")
        };
        for(Restaurant r:restaurants){
            r.printDetails(100.0);
        }
    }
}