/*
Identify commonalities and differences 
between Publication, Book and Magazine classes. 
Title, Price, Copies
are common instance variables and saleCopy is common method.
The differences are, Bookclass has author
and order Copies(). Magazine Class has orderQty, 
Currentissue, reciveissue().Write a program to find how
Currentissue, reciveissue().Write a program to find how
many copies of the given books are ordered and display total sale of publication. 
*/
class Publication {
    String title;
    double price;
    int copies;
    public Publication(String title, double price, int copies) {
    this.title = title;
    this.price = price;
    this.copies = copies;
    }
    public void saleCopy(int numberOfCopies) {
    copies -= numberOfCopies;
    }
    public double totalSale() {
    return price * copies;
    }
    }
    class Book extends Publication {
    String author;
    public Book(String title, double price, int copies, String author) {
    super(title, price, copies);
    this.author = author;
    }
    public void orderCopies(int numberOfCopies) {
    copies += numberOfCopies;
    }
    }
    class Magazine extends Publication {
    int orderQty;
    int currentIssue;
    public Magazine(String title, double price, int copies, int orderQty, int currentIssue) {
    super(title, price, copies);
    this.orderQty = orderQty;
    this.currentIssue = currentIssue;
    }
    public void receiveIssue(int newIssue) {
    currentIssue = newIssue;
    copies += orderQty;
    }
    }
    public class PublicationDemo {
    public static void main(String[] args) {
    // Create book and magazine objects
    Book book1 = new Book("oop", 29.99, 100, "balguru swami");
    Book book2 = new Book("c", 39.99, 50, "yashwant kanetkar");
    Magazine magazine1 = new Magazine("magic pot", 9.99, 200, 100, 1);
    Magazine magazine2 = new Magazine("india today", 12.99, 300, 150, 2);
    // Order copies for books
    book1.orderCopies(20);
    book2.orderCopies(30);
    System.out.println("111 :"+book1.totalSale());
    System.out.println("222 :"+book2.totalSale());
    // Calculate total sales for books
    double totalBookSales = book1.totalSale() + book2.totalSale();
    System.out.println("Total sales for books: $" + totalBookSales);
    // Calculate total copies ordered for books
    int totalBookCopiesOrdered = book1.copies + book2.copies;
    System.out.println("Total copies ordered for books: " + totalBookCopiesOrdered);
    // Receive new issues for magazines
    magazine1.receiveIssue(2);
    magazine2.receiveIssue(3);
    // Calculate total sales for magazines
    double totalMagazineSales = magazine1.totalSale() + magazine2.totalSale();
    System.out.println("Total sales for magazines: $" + totalMagazineSales);
    // Calculate total sales for all publications
    double totalSales = totalBookSales + totalMagazineSales;
    System.out.println("Total sales for all publications: $" + totalSales);
    }
    }