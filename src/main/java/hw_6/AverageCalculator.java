package hw_6;
import java.util.List;

/**
 * Класс для рассчета среднего значения и сравнения средних значений двух списков чисел.
 */
public class AverageCalculator {

    /**
     * Рассчитывает среднее значение списка чисел.
     *
     * @param numbers Список чисел.
     * @return Среднее значение списка.
     */
    public double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    /**
     * Сравнивает средние значения двух списков чисел и возвращает соответствующее сообщение.
     *
     * @param list1 Первый список чисел.
     * @param list2 Второй список чисел.
     * @return Сообщение о сравнении средних значений.
     */
    public String compareAverages(List<Integer> list1, List<Integer> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}