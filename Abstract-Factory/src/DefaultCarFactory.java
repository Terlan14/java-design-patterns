public class DefaultCarFactory implements CarFactory
{


    public static Car buildCar(CarType model)
    {
        Car car=null;
        switch (model)
        {
            case MINI :
                car=new MiniCar(Location.DEFAULT);
                break;
            case MICRO:
                car=new MicroCar(Location.DEFAULT);
                break;
            case LUXURY:
                car=new LuxuryCar(Location.DEFAULT);
        }
        return car;
    }
}
