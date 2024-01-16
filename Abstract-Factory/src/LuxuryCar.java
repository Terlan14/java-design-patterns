public class LuxuryCar extends Car {
    LuxuryCar(Location location) {
        super(CarType.LUXURY,location);
        drive();
    }

    @Override
    void drive()
    {
        System.out.println("Luxury car is driven...");
    }
}
