package hw_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Класс для тестирования класса AverageCalculator.
 */
public class AverageCalculatorTest {
    private AverageCalculator calculator;

    /**
     * Инициализация объекта AverageCalculator перед каждым тестом.
     */
    @BeforeEach
    void setUp() {
        calculator = new AverageCalculator();
    }

    /**
     * Тест для метода calculateAverage, когда список чисел пустой.
     */
    @Test
    void testCalculateAverageEmptyList() {
        List<Integer> numbers = new ArrayList<>();
        double result = calculator.calculateAverage(numbers);
        assertEquals(0.0, result, 0.001);
    }

    /**
     * Тест для метода calculateAverage, когда список чисел не пустой.
     */
    @Test
    void testCalculateAverageNonEmptyList() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        double result = calculator.calculateAverage(numbers);
        assertEquals(3.0, result, 0.001);
    }

    /**
     * Тест для метода compareAverages, когда среднее значение первого списка больше среднего значения второго списка.
     */
    @Test
    void testCompareAveragesFirstGreater() {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(1, 2, 3);
        String result = calculator.compareAverages(list1, list2);
        assertEquals("Первый список имеет большее среднее значение", result);
    }

    /**
     * Тест для метода compareAverages, когда среднее значение второго списка больше среднего значения первого списка.
     */
    @Test
    void testCompareAveragesSecondGreater() {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(1, 2, 3, 4, 5);
        String result = calculator.compareAverages(list1, list2);
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    /**
     * Тест для метода compareAverages, когда средние значения списков равны.
     */
    @Test
    void testCompareAveragesEqual() {
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(1, 2, 3, 4);
        String result = calculator.compareAverages(list1, list2);
        assertEquals("Средние значения равны", result);
    }
}
