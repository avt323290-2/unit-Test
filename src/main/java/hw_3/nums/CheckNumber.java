package hw_3.nums;

/**
 * Класс, предоставляющий методы для проверки чисел на четность и принадлежность интервалу.
 */
public class CheckNumber {

    /**
     * Метод для проверки, является ли число четным.
     *
     * @param n Целое число, которое нужно проверить.
     * @return true, если число четное, иначе false.
     */
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Метод для проверки, находится ли число в интервале [25, 100].
     *
     * @param n Целое число, которое нужно проверить на принадлежность интервалу.
     * @return true, если число находится в интервале [25, 100], иначе false.
     */
    public boolean numberInInterval(int n) {
        return n >= 25 && n <= 100;
    }
}