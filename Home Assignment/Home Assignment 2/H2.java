class Book{
    private int bookId;
    private String bookName;
    private double price;
    
    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }


    public void setBookId(int bookId) {
        this.bookId = bookId;
    }


    public String getBookName() {
        return bookName;
    }


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "Book{ Book ID: "+bookId+", Book Name: "+bookName+", Price: "+price+"}";
    }
    public boolean equals(Object obj){
        if (this == obj)
              return true;
        if(obj == null || getClass() != obj.getClass())
             return false;
        Book book = (Book) obj;
        return Double.compare(book.price, price)==0;           
    }

}
public class H2 {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Book1", 10.0);
        Book book2 = new Book(2, "Book2", 20.0);
        System.out.println("Book 1 details: "+book1);
        System.out.println("Book 2 details: "+book2);
        if(book1.equals(book2))
           System.out.println("Both books have the same price");
        else
           System.out.println("Books have different prices");
    }
}
