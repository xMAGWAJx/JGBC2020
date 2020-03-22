package lesson05.booklesson5;

import java.util.Objects;

public class Book {

    private String authorName;
    private String bookTitle;
    private int numberOfPages;

    public Book(String authorName, String bookTitle, int numberOfPages) {
        this.authorName = authorName;
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName = '" + authorName + '\'' +
                ", bookTitle = '" + bookTitle + '\'' +
                ", numberOfPages = " + numberOfPages +
                '}';
    }
}
