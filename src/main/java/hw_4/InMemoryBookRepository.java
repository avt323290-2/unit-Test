package hw_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Реализация репозитория книг, хранящего данные в памяти.
 */
public class InMemoryBookRepository implements BookRepository {
    private final Map<String, Book> books;

    /**
     * Конструктор для создания экземпляра InMemoryBookRepository и инициализации начальных данных.
     */
    public InMemoryBookRepository() {
        this.books = new HashMap<>();
        books.put("1", new Book("1", "Book1", "Author1"));
        books.put("2", new Book("2", "Book2", "Author2"));
    }

    /**
     * Найти книгу по её идентификатору.
     *
     * @param id Идентификатор книги.
     * @return Книга, найденная по идентификатору, или null, если книга не найдена.
     */
    @Override
    public Book findById(String id) {
        return books.get(id);
    }

    /**
     * Получить список всех книг в репозитории.
     *
     * @return Список всех книг в репозитории.
     */
    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }
}