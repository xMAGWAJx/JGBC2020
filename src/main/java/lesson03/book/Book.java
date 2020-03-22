package lesson03.book;

public class Book {
    public String title;
    public String publisher;
    public String isbn;
    public int pageCount;

    public Book() {
    }

    public Book(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public Book(String title, String publisher, String isbn, int pageCount) {
        this.title = title;
        this.publisher = publisher;
        this.isbn = isbn;
        this.pageCount = pageCount;
    }

    public void printInformation() {
        System.out.println("javaBook.title = " + this.title);
        System.out.println("javaBook.publisher = " + this.publisher);
        System.out.println("javaBook.isbn = " + this.isbn);
        System.out.println("javaBook.pageCount = " + this.pageCount);
    }
}
