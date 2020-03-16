package lesson10.simpledatabase;

public class Book {

  private String id;
  private String name;
  private String author;
  private int pagesCount;

  public Book(String id, String name, String author, int pagesCount) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.pagesCount = pagesCount;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  public int getPagesCount() {
    return pagesCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Book book = (Book) o;

    if (pagesCount != book.pagesCount) return false;
    if (id != null ? !id.equals(book.id) : book.id != null) return false;
    if (name != null ? !name.equals(book.name) : book.name != null) return false;
    return author != null ? author.equals(book.author) : book.author == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (author != null ? author.hashCode() : 0);
    result = 31 * result + pagesCount;
    return result;
  }

  @Override
  public String toString() {
    return "Book{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", author='" + author + '\'' +
            ", pagesCount=" + pagesCount +
            '}';
  }
}
