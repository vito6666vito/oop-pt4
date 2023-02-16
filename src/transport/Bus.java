package transport;

public class Bus extends Transport <DriverD> {
    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Автобус " + getBrand() + " завершил движение");
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп автобуса");
    }

    @Override
    public void bestTimeLap() {
        int minLimit = 25;
        int maxLimit = 40;
        int bestTime = (int) (minLimit - (maxLimit - minLimit) * Math.random());
        System.out.println("Лучшее время за круг автобуса в минутах " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int minLimit = 90;
        int maxLimit = 120;
        int maxSpeed = (int) (minLimit - (maxLimit - minLimit) * Math.random());
        System.out.println("Максимальная скорость автобуса " + maxSpeed);

    }
}
