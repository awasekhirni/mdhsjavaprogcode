package MiltonLibrary;

public class Book {

    private String bookId;
    private String bookName;
    private String authorName;
    private double price;
    private int quantity;

    // getter
    public String getAuthorName() {
        return authorName;
    }

    public String getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // setter
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
