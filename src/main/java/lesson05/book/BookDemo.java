package lesson05.book;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Head First Java", "O'Reilly", "Technology");
        Book book2 = new Book("Head First Java", "O'Reilly", "Technology");
        System.out.println("book1 == book1 = " + (book1 == book1));
        System.out.println("book1 == book2 = " + (book1 == book2));
        System.out.println("book1.equals(book1) = " + book1.equals(book1));
        System.out.println("book1.equals(book2) = " + book1.equals(book2));
    }
}
