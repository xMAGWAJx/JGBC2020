package lesson10.simpledatabase;

public class BookRepositoryDemo {

    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepository();

        System.out.println(bookRepository.findAll());

        bookRepository.save(new Book("1", "Book1", "Author1", 100));
        bookRepository.save(new Book("2", "Book2", "Author2", 200));
        bookRepository.save(new Book("3", "Book3", "Author3", 300));
        bookRepository.save(new Book("4", "Book4", "Author4", 400));

        System.out.println(bookRepository.findAll());

//    bookRepository.delete("4");

        bookRepository.deleteException("1");
        bookRepository.deleteException("5");

        bookRepository.findByIdException("2");
        bookRepository.findByIdException("6");


    }
}
