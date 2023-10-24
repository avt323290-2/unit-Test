package hw_2;

/**
 * Класс, представляющий автомобиль.
 */
public class Car extends Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    /**
     * Конструктор для создания экземпляра класса Car.
     *
     * @param company Компания-производитель автомобиля.
     * @param model   Модель автомобиля.
     * @param year    Год выпуска автомобиля.
     * @throws IllegalArgumentException Если год выпуска отрицателен.
     */
    public Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        if (year < 0) {
            throw new IllegalArgumentException("Год выпуска должен быть положительным целым числом");
        }
        this.numWheels = 4;
        this.speed = 0;
    }

    /**
     * Метод для тестовой поездки на автомобиле (устанавливает скорость на 60).
     */
    public void testDrive() {
        this.speed = 60;
    }

    /**
     * Метод для припарковывания автомобиля (устанавливает скорость на 0).
     */
    public void park() {
        this.speed = 0;
    }

    /**
     * Возвращает компанию-производителя автомобиля.
     *
     * @return Компания-производитель.
     */
    public String getCompany() {
        return company;
    }

    /**
     * Возвращает модель автомобиля.
     *
     * @return Модель автомобиля.
     */
    public String getModel() {
        return model;
    }

    /**
     * Возвращает год выпуска автомобиля.
     *
     * @return Год выпуска.
     */
    public int getYearRelease() {
        return yearRelease;
    }

    /**
     * Возвращает количество колес у автомобиля (всегда 4).
     *
     * @return Количество колес.
     */
    public int getNumWheels() {
        return numWheels;
    }

    /**
     * Возвращает текущую скорость автомобиля.
     *
     * @return Текущая скорость.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Представляет информацию об автомобиле в виде строки.
     *
     * @return Информация о автомобиле.
     */
    public String toString() {
        return "Этот автомобиль: " + yearRelease + " " + company + " " + model;
    }
}