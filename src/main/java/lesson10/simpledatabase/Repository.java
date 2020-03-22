package lesson10.simpledatabase;

import java.util.List;

public interface Repository<Book> {

    List<Book> findAll();

    Book findById(String id) throws ItemNotFoundException;

    void save(Book item);

    void delete(String id) throws ItemNotFoundException;

}
