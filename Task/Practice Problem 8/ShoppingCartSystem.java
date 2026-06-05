import java.util.ArrayList;
import java.util.List;
public class ShoppingCartSystem{
    static class Product{
        private int id;
        private String productName;
        private double pricePerUnit;
        Product(int id,String name,double price){
            this.id=id;
            productName=name;
            pricePerUnit=price;
        }
        int getId(){ return id; }
        String getProductName(){ return productName; }
        double getPricePerUnit(){ return pricePerUnit; }

        void setProductName(String n){ productName=n; }
        void setPricePerUnit(double p){ pricePerUnit=p; }

        public String toString(){
            return productName+" ($"+pricePerUnit+")";
        }
    }
    static class Customer{
        private int userId;
        private String name,phoneNo;
        Customer(int id,String name,String phone){
            userId=id;
            this.name=name;
            phoneNo=phone;
        }
        int getUserId(){ return userId; }
        String getName(){ return name; }
        String getPhoneNo(){ return phoneNo; }
        void setName(String n){ name=n; }
        void setPhoneNo(String p){ phoneNo=p; }
        void registerUser(){
            System.out.println("Registered: "+name+" (ID="+userId+")");
        }
    }
    static class ShoppingCart{
        private int cartId,userId;
        private List<Product> productList=new ArrayList<>();
        ShoppingCart(int cartId,int userId){
            this.cartId=cartId;
            this.userId=userId;
        }
        static ShoppingCart createCart(int cartId,int userId){
            return new ShoppingCart(cartId,userId);
        }
        void addProduct(Product p){
            productList.add(p);
        }
        List<Product> getProductList(){
            return productList;
        }
        double totalPrice(){
            return productList.stream().mapToDouble(Product::getPricePerUnit).sum();
        }
    }
    static class Payment{
        private int paymentId;
        private double totalAmount;
        private String status;
        Payment(int id,double amount){
            paymentId=id;
            totalAmount=amount;
            status="Pending";
        }
        double calculatePrice(ShoppingCart cart){
            return cart.totalPrice();
        }
        void makePayment(){
            status="Completed";
            System.out.printf("Payment #%d of $%.2f — %s%n",
                    paymentId,totalAmount,status);
        }
    }
    public static void main(String[] args){
        Customer c=new Customer(1,"Kakashi","01700000000");
        c.registerUser();
        ShoppingCart cart=ShoppingCart.createCart(1,c.getUserId());
        cart.addProduct(new Product(101,"Laptop",999.99));
        cart.addProduct(new Product(102,"Mouse",25.00));
        cart.addProduct(new Product(103,"Keyboard",55.00));
        System.out.println("Cart items:");
        for(Product p:cart.getProductList()){
            System.out.println("  "+p);
        }
        Payment pay=new Payment(501,cart.totalPrice());
        System.out.printf("Total: $%.2f%n",pay.calculatePrice(cart));
        pay.makePayment();
    }
}