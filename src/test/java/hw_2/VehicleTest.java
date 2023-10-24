package hw_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс для тестирования классов Car и Motorcycle, наследующихся от Vehicle.
 */
public class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        car = new Car("VOLKSWAGEN", "TIGUAN", 2021);
        motorcycle = new Motorcycle("Kawasaki", "BALIUS 250", 2023);
    }

    // Проверяем, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    @DisplayName("Car является транспортным средством")
    public void carIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    // Проверяем, что объект Car создается с 4-мя колесами
    @Test
    @DisplayName("Car создается с 4-мя колесами")
    public void carNumWheelsTest() {
        assertEquals(4, car.getNumWheels());
    }

    // Проверяем, что объект Motorcycle создается с 2-мя колесами
    @Test
    @DisplayName("Motorcycle создается с 2-мя колесами")
    public void motorcycleNumWheelsTest() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    // Проверяем, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive())
    @Test
    @DisplayName("Car развивает скорость 60 в режиме тестового вождения")
    public void carTestDriveSpeedTest() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    // Проверяем, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive())
    @Test
    @DisplayName("Motorcycle развивает скорость 75 в режиме тестового вождения")
    public void motorcycleTestDriveSpeedTest() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    // Проверяем, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    @DisplayName("Скорость Car, когда установлен режим парковка")
    public void carParkingSpeedTest() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    // Проверяем, что в режиме парковки (сначала testDrive, потом park - эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    @DisplayName("Скорость Motorcycle когда установлен режим парковка")
    public void motorcycleParkingSpeedTest() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }

    // Добавляем тесты на исключения
    /**
     * Эти тесты (negativeYearForCarThrowsException и negativeYearForMotorcycleThrowsException) проверяют,
     * что конструкторы классов Car и Motorcycle выбрасывают исключение IllegalArgumentException
     * при попытке создать объект с отрицательным годом выпуска. Нами используется метод assertThrows, который
     * ожидает генерации исключения указанного типа при выполнении лямбда-выражения. Эти тесты позволяют обнаружить
     * ошибки валидации данных и защитить программу от некорректного использования.
     */
    @Test
    @DisplayName("Отрицательный год выпуска автомобиля вызывает исключение")
    public void negativeYearForCarThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Car("VOLKSWAGEN", "TIGUAN", -2023));
    }

    @Test
    @DisplayName("Отрицательный год выпуска мотоцикла вызывает исключение")
    public void negativeYearForMotorcycleThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Motorcycle("Kawasaki", "BALIUS 250", -2022));
    }
}