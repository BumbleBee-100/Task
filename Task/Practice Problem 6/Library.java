public class Library{
    static class Books{
        int bookId;
        String bookName,bookAuthor,status;
        float price;
        Books(int id,String name,String author,float price){
            this.bookId=id;
            this.bookName=name;
            this.bookAuthor=author;
            this.price=price;
            this.status="Available";
        }
        void addNewBook(){
            System.out.println("Book added: "+bookName);
        }
        void deleteBook(){
            System.out.println("Book deleted: "+bookName);
        }
        void displayBookDetails(){
            System.out.printf("ID:%-3d %-20s %-15s $%.2f [%s]%n",bookId,bookName,bookAuthor,price,status);
        }
        void inquiryBook(){
            System.out.println(bookName+" -> "+status);
        }
    }
    static class Librarian{
        int id;
        String name;
        Librarian(int id,String name){
            this.id=id;
            this.name=name;
        }
        void searchBook(String name){
            System.out.println("Searching: "+name);
        }
        boolean verifyMember(int id){
            System.out.println("Verified: "+id);
            return true;
        }
        void orderBooks(){
            System.out.println(name+" ordered books.");
        }
        void sellBooks(){
            System.out.println(name+" sold books.");
        }
    }
    static class User{
        int userID,phoneNo;
        String userName,userAddress;
        User(int id,String name,String addr,int phone){
            userID=id;
            userName=name;
            userAddress=addr;
            phoneNo=phone;
        }
        void returnBooks(){
            System.out.println(userName+" returned a book.");
        }
        void payFine(String date,int n){
            System.out.println(userName+" paid $"+n+" on "+date);
        }
        void addNewUser(){
            System.out.println("User added: "+userName);
        }
        void deleteUser(){
            System.out.println("User deleted: "+userName);
        }
        void updateDetails(){
            System.out.println("Updated: "+userName);
        }
        void bookPurchase(){
            System.out.println(userName+" purchased a book.");
        }
    }
    static class Publisher{
        int id,phoneNo;
        String name,address;
        Publisher(int id,String name,String addr,int phone){
            this.id=id;
            this.name=name;
            this.address=addr;
            this.phoneNo=phone;
        }
        void addPub(){
            System.out.println("Publisher added: "+name);
        }
        void modifyPub(){
            System.out.println("Publisher modified: "+name);
        }
        void deletePub(){
            System.out.println("Publisher deleted: "+name);
        }
        void orderStatus(){
            System.out.println("Order status for: "+name);
        }
    }
    public static void main(String[] args){
        Books b=new Books(1,"Effective Java","Joshua Bloch",45.99f);
        b.displayBookDetails();
        b.inquiryBook();
        Librarian lib=new Librarian(1,"Mr. Rahman");
        lib.searchBook("Effective Java");
        lib.verifyMember(101);
        User u=new User(101,"Alice","Dhaka",1234567);
        u.addNewUser();
        u.bookPurchase();
        Publisher p=new Publisher(1,"O'Reilly","CA, USA",9876543);
        p.addPub();
        p.orderStatus();
    }
}