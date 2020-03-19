package lesson09.library;

public class LibraryDemo {

  public static void main(String[] args) {
    Book bookOne = new Book("War and Peace", "Leo Tolstoy");
    Book bookTwo = new Book("Anna Karenina", "Leo Tolstoy");

    Library library = new Library();

//    library.addBook(bookOne);
//    library.addBook(bookTwo);

//    library.findByName("War and Peace"); //Should return bookOne
//    library.findByAuthor("Leo Tolstoy"); //Should return bookOne, bookTwo
//
//    library.deleteBook(bookTwo);
  }
}
