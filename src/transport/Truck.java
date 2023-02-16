package transport;

public class Truck extends Transport <DriverC> {
    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик " + getBrand() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Грузовик " + getBrand() + " завершил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп грузовика");
    }

    @Override
    public void bestTimeLap() {
        int minLimit = 15;
        int maxLimit = 25;
        int bestTime = (int) (minLimit - (maxLimit - minLimit) * Math.random());
        System.out.println("Лучшее время за круг грузовика в минутах " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int minLimit = 100;
        int maxLimit = 150;
        int maxSpeed = (int) (minLimit - (maxLimit - minLimit) * Math.random());
        System.out.println("Максимальная скорость грузовика " + maxSpeed);

    }
}