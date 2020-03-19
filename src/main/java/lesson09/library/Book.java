package lesson09.library;

public class Book {

  private String bookTitle;
  private String bookAuthor;

  public Book (String title, String author) {
    this.bookTitle = bookTitle;
    this.bookAuthor = bookAuthor;
  }

  public String getBookTitle() {
    return bookTitle;
  }

  public String getBookAuthor() {
    return bookAuthor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Book book = (Book) o;

    if (bookTitle != null ? !bookTitle.equals(book.bookTitle) : book.bookTitle != null) return false;
    return bookAuthor != null ? bookAuthor.equals(book.bookAuthor) : book.bookAuthor == null;
  }

  @Override
  public int hashCode() {
    int result = bookTitle != null ? bookTitle.hashCode() : 0;
    result = 31 * result + (bookAuthor != null ? bookAuthor.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Book{" +
            "bookTitle='" + bookTitle + '\'' +
            ", bookAuthor='" + bookAuthor + '\'' +
            '}';
  }
}
