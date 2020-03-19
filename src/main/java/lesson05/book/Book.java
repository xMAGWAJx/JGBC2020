package lesson05.book;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {

        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;

    }
    public String getAuthor() {
        return author;

    }
    public String getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(genre, book.genre);
    }
}
