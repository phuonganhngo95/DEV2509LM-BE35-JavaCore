package Lab11.BT4;

public class Book {
    private String isbn;
    private String bookName;
    private String author;
    private String publisher;
    private float price;

    public Book() {}

    public Book(String isbn, String bookName, String author, String publisher, float price) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn +
                "Tên sách: " + bookName +
                "Tác giả: " + author +
                "NXB: " + publisher +
                "Giá: " + String.format("%.2f", price) + " VND";
    }
}