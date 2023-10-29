package hw_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageCalculatorTest {
    private AverageCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new AverageCalculator();
    }

    @Test
    void testCalculateAverageEmptyList() {
        List<Integer> numbers = new ArrayList<>();
        double result = calculator.calculateAverage(numbers);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    void testCalculateAverageNonEmptyList() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        double result = calculator.calculateAverage(numbers);
        assertEquals(3.0, result, 0.001);
    }

    @Test
    void testCompareAveragesFirstGreater() {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(1, 2, 3);
        String result = calculator.compareAverages(list1, list2);
        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    void testCompareAveragesSecondGreater() {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(1, 2, 3, 4, 5);
        String result = calculator.compareAverages(list1, list2);
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    void testCompareAveragesEqual() {
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(1, 2, 3, 4);
        String result = calculator.compareAverages(list1, list2);
        assertEquals("Средние значения равны", result);
    }
}