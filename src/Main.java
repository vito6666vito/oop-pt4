import transport.*;


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Водитель B # " + i, true, 10);
            DriverD driverD = new DriverD("Водитель D # " + i, true, 10);
            DriverC driverC = new DriverC("Водитель C # " + i, true, 10);

            Car auto = new Car("Бренд авто № " + i, "Модель авто " + i, 1.6, driverB);
            Bus bus = new Bus("Бренд автобуса № " + i, "Модель автобуса " + i, 4, driverD);
            Truck truck = new Truck("Бренд грузовика № " + i, "Модель грузовика " + i, 4.5, driverC);

            printer(auto);
            printer(bus);
            printer(truck);
        }

    }

    private static void printer(Transport transport) {
        System.out.println("Водитель " + transport.getDriver().getFIO() + " управляет автомобилем "
                + transport.getBrand() + " и будет участвовать в заезде");
    }

}