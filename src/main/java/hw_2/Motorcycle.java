package hw_2;

/**
 * Класс, представляющий мотоцикл.
 */
public class Motorcycle extends Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    /**
     * Конструктор для создания экземпляра класса Motorcycle.
     *
     * @param company Компания-производитель мотоцикла.
     * @param model   Модель мотоцикла.
     * @param year    Год выпуска мотоцикла.
     * @throws IllegalArgumentException Если год выпуска отрицателен.
     */
    public Motorcycle(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        if (year < 0) {
            throw new IllegalArgumentException("Год выпуска должен быть положительным целым числом");
        }
        this.numWheels = 2;
        this.speed = 0;
    }

    /**
     * Метод для тестовой поездки на мотоцикле (устанавливает скорость на 75).
     */
    public void testDrive() {
        this.speed = 75;
    }

    /**
     * Метод для припарковывания мотоцикла (устанавливает скорость на 0).
     */
    public void park() {
        this.speed = 0;
    }

    /**
     * Возвращает компанию-производителя мотоцикла.
     *
     * @return Компания-производитель.
     */
    public String getCompany() {
        return company;
    }

    /**
     * Возвращает модель мотоцикла.
     *
     * @return Модель мотоцикла.
     */
    public String getModel() {
        return model;
    }

    /**
     * Возвращает год выпуска мотоцикла.
     *
     * @return Год выпуска.
     */
    public int getYearRelease() {
        return yearRelease;
    }

    /**
     * Возвращает количество колес у мотоцикла (всегда 2).
     *
     * @return Количество колес.
     */
    public int getNumWheels() {
        return numWheels;
    }

    /**
     * Возвращает текущую скорость мотоцикла.
     *
     * @return Текущая скорость.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Представляет информацию о мотоцикле в виде строки.
     *
     * @return Информация о мотоцикле.
     */
    public String toString() {
        return "Этот мотоцикл: " + yearRelease + " " + company + " " + model + ";";
    }
}