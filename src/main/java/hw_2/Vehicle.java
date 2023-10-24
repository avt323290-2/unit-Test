package hw_2;

/**
 * Абстрактный класс, представляющий транспортное средство.
 */
public abstract class Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    /**
     * Абстрактный метод для тестовой поездки на транспортном средстве.
     * Реализации этого метода должна устанавливать скорость транспортного средства.
     */
    public abstract void testDrive();

    /**
     * Абстрактный метод для припарковывания транспортного средства.
     * Реализации этого метода должна устанавливать скорость транспортного средства в ноль.
     */
    public abstract void park();
}