public class Library{
    private static int totalBooksIssued=0;
    private String borrowerName;
    Library(String borrowerName){
        this.borrowerName=borrowerName;
    }
    void issueBook(String bookTitle){
        totalBooksIssued++;
        System.out.println(borrowerName+" issued: "+bookTitle+" | Total so far: "+totalBooksIssued);
    }
    static int getTotalBooksIssued(){
        return totalBooksIssued;
    }
    public static void main(String[] args){
        Library u1=new Library("Alice");
        Library u2=new Library("Bob");
        u1.issueBook("Effective Java");
        u2.issueBook("Clean Code");
        u1.issueBook("Design Patterns");
        System.out.println("Total: "+Library.getTotalBooksIssued());
    }
}