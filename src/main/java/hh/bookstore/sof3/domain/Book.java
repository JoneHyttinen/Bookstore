package hh.bookstore.sof3.domain;

public class Book {
    String title;
    String author;
    int publicationYear;
    String isbn;
    float price;

    public Book() {
        title = null;
        author = null;
        publicationYear = 0;
        isbn = null;
        price = 0.0F;
    }

    public Book(String title, String author, int publicationYear, String isbn, float price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public float getPrice() {
        return price;
    }
}
