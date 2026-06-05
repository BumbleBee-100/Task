public class Book{
    private String title,author;
    Book(String title){
        this.title=title;
        this.author="Unknown";
    }
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public String toString(){
        return "\""+title+"\" by "+author;
    }
    public static void main(String[] args){
        System.out.println(new Book("Effective Java"));
        System.out.println(new Book("Clean Code","Robert C. Martin"));
    }
}