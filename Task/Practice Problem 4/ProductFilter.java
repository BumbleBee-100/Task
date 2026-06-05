public class ProductFilter{
    //By category only
    static void filterProducts(String category){
        System.out.println("Filtering by category: "+category);
    }
    //By price range only
    static void filterProducts(double minPrice,double maxPrice){
        System.out.println("Price: $"+minPrice+" - $"+maxPrice);
    }
    //By category and brand
    static void filterProducts(String category,String brand){
        System.out.println("Category: "+category+", Brand: "+brand);
    }
    //By category and price range
    static void filterProducts(String category,double min,double max){
        System.out.println("Category: "+category+", Price: $"+min+" - $"+max);
    }
    // By category, price range and brand
    static void filterProducts(String category,double min,double max,String brand){
        System.out.println("Category: "+category+", Price: $"+min+" - $"+max+", Brand: "+brand);
    }
    public static void main(String[] args){
        filterProducts("electronics");
        filterProducts(100,500);
        filterProducts("fashion","Nike");
        filterProducts("electronics",100,500);
        filterProducts("electronics",100,500,"Apple");
    }
}