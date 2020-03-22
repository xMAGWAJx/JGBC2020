package lesson10.simpledatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<Book> {

    HashMap<String, Book> bookRepository = new HashMap<>();

    @Override
    public List<Book> findAll() {
        List<Book> allBooks = new ArrayList<>();
        for (Map.Entry<String, Book> mapEntry : bookRepository.entrySet()) {
            allBooks.add(mapEntry.getValue());
        }
        return allBooks;
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        if (!bookRepository.containsKey(id)) {
            throw new ItemNotFoundException("Book with id = " + id + " not found in bookRepository.");
        }
        return bookRepository.get(id);
    }

    public void findByIdException(String id) {
        try {
            System.out.println(findById(id));
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void save(Book book) {
        bookRepository.put(book.getId(), book);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        if (!bookRepository.containsKey(id)) {
            throw new ItemNotFoundException("Book with id = " + id + " was not deleted. Book with this id does not exist.");
        } else {
            bookRepository.remove(id);
        }
    }

    public void deleteException(String id) {
        try {
            delete(id);
            System.out.println("Book with id = " + id + " was deleted.");
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


}
