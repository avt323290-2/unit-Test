package hw_4;

/**
 * Класс, представляющий книгу.
 */
public class Book {

    private String id;
    private String title;
    private String author;

    /**
     * Конструктор для создания объекта Book с заданным идентификатором.
     *
     * @param id Идентификатор книги.
     */
    public Book(String id) {
        this.id = id;
    }

    /**
     * Конструктор для создания объекта Book с заданными идентификатором, названием и автором.
     *
     * @param id     Идентификатор книги.
     * @param title  Название книги.
     * @param author Автор книги.
     */
    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    /**
     * Получить идентификатор книги.
     *
     * @return Идентификатор книги.
     */
    public String getId() {
        return id;
    }

    /**
     * Установить идентификатор книги.
     *
     * @param id Идентификатор книги.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Получить название книги.
     *
     * @return Название книги.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Установить название книги.
     *
     * @param title Название книги.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Получить автора книги.
     *
     * @return Автор книги.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Установить автора книги.
     *
     * @param author Автор книги.
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}