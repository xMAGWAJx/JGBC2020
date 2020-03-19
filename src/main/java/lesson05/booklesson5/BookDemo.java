package lesson05.booklesson5;

public class BookDemo {

  public static void main(String[] args) {

    Book book1 = new Book ("Andrei Doronine", "Transsiberian back to black", 100500 );
    Book book2 = new Book ("Andrei Doronine", "Transsiberian back to black", 100500 );
    Book book3 = new Book ("Coconut", "Coconut stories", 777 );
    Book book4 = new Book("SomeAuthor","SomeTitle", 999);
    Book book5 = new Book("Test4","any4", 27);


    System.out.println("Example1: for toString(). \nResult1: " + book1); // Book{authorName = 'Andrei Doronine', bookTitle = 'Transsiberian back to black', numberOfPages = 100500}

    System.out.println("Example2: for equals(). \nResult2.1: " + book1.equals(book2)); // true
    System.out.println("Example2: for equals(). \nResult2.2: " + book1.equals(book3)); // false

    System.out.println("Example3: for getMethods. \nResult3: " + "Author: " + book1.getAuthorName() +
            ". Book title: " + book1.getBookTitle() +
            ". Number of pages: " + book1.getNumberOfPages()); // Author: Andrei Doronine. Book title: Transsiberian back to black. Number of pages: 100500

    System.out.println("Example4: for setMethods. \nResult4.1: " + book4); // Book{authorName = 'SomeAuthor', bookTitle = 'SomeTitle', numberOfPages = 999}

    book4.setAuthorName("Victor Pelevin");
    book4.setBookTitle("Generation P");
    book4.setNumberOfPages(300);

    System.out.println("Example4: for setMethods. \nResult4.2: " + book4); // Book{authorName = 'Victor Pelevin', bookTitle = 'Generation P', numberOfPages = 300}

    System.out.println("Example5: generated output for BookTest - Test4. \nResult5: " + book5);
  }
}
