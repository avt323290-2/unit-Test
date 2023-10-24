package hw_3.tdd;

/**
 * Класс, представляющий пользователя с аутентификацией и административными правами.
 */
public class User {
    String name; // Имя пользователя.
    String password; // Пароль пользователя.
    boolean isAdmin = false; // Флаг, указывающий, является ли пользователь администратором.
    boolean isAuthenticate = false; // Флаг, указывающий, прошел ли пользователь аутентификацию.

    /**
     * Конструктор класса User.
     *
     * @param name     Имя пользователя.
     * @param password Пароль пользователя.
     * @param isAdmin  Флаг, указывающий, является ли пользователь администратором.
     */
    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    /**
     * Метод для получения информации о том, является ли пользователь администратором.
     *
     * @return true, если пользователь администратор, иначе false.
     */
    public boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * Метод для аутентификации пользователя.
     *
     * @param name     Имя пользователя для аутентификации.
     * @param password Пароль пользователя для аутентификации.
     * @return true, если аутентификация прошла успешно, иначе false.
     */
    public boolean authenticate(String name, String password) {
        isAuthenticate = this.name.equals(name) && this.password.equals(password);
        return isAuthenticate;
    }
}