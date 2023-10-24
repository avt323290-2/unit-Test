package hw_3.tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий хранилище пользователей с функциональностью добавления, поиска по имени и разлогинивания пользователей.
 */
public class UserRepository {

    // Список, в котором хранятся аутентифицированные пользователи.
    List<User> data = new ArrayList<>();

    /**
     * Метод для добавления пользователя в хранилище.
     *
     * @param user Пользователь, который должен быть добавлен в хранилище.
     */
    public void addUser(User user) {
        data.add(user);
    }

    /**
     * Метод для поиска пользователя по имени.
     *
     * @param username Имя пользователя, которое нужно найти.
     * @return true, если пользователь с указанным именем найден, иначе false.
     */
    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод для разлогинивания всех пользователей, кроме администраторов.
     */
    public void logoutAllUsersExceptAdmins() {
        for (User user : data) {
            if (!user.getIsAdmin()) {
                user.isAuthenticate = false;
            }
        }
    }
}