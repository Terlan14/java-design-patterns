public class MicroCar extends Car {
    MicroCar( Location location) {
        super(CarType.MICRO,location);
        drive();
    }

    @Override
    void drive()
    {
        System.out.println("Micro car is driven...");
    }
}
