public class MiniCar extends Car {
    MiniCar( Location location) {
        super(CarType.MINI, location);
        drive();
    }

    @Override
    void drive()
    {
        System.out.println("Mini car is driven...");
    }
}
