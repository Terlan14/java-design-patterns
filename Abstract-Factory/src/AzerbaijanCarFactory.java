public class AzerbaijanCarFactory
{
    public static Car buildCar(CarType model)
{
    Car car=null;
    switch (model)
    {
        case MINI :
            car=new MiniCar(Location.AZERBAIJAN);
            break;
        case MICRO:
            car=new MicroCar(Location.AZERBAIJAN);
            break;
        case LUXURY:
            car=new LuxuryCar(Location.AZERBAIJAN);
    }
    return car;
}
}
