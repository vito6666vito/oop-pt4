package transport;

public class Car extends Transport <DriverB> {
    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Автомобиль " + getBrand() + " завершил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп автомобиля");
    }

    @Override
    public void bestTimeLap() {
        int minLimit = 15;
        int maxLimit = 25;
        int bestTime = (int) (minLimit - (maxLimit - minLimit) * Math.random());
        System.out.println("Лучшее время за круг автомобиля в минутах " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int minLimit = 120;
        int maxLimit = 180;
        int maxSpeed = (int) (minLimit - (maxLimit - minLimit) * Math.random());
        System.out.println("Максимальная скорость автомобиля " + maxSpeed);

    }
}
