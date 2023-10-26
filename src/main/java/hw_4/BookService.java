package hw_4;

import java.util.List;

/**
 * Сервис для работы с книгами.
 */
public class BookService {
    private BookRepository bookRepository;

    /**
     * Конструктор для создания экземпляра BookService с указанным репозиторием книг.
     *
     * @param bookRepository Репозиторий книг, с которым будет взаимодействовать сервис.
     */
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * Найти книгу по её идентификатору.
     *
     * @param id Идентификатор книги.
     * @return Книга, найденная по идентификатору, или null, если книга не найдена.
     */
    public Book findBookById(String id) {
        return bookRepository.findById(id);
    }

    /**
     * Получить список всех книг.
     *
     * @return Список всех книг в репозитории.
     */
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}