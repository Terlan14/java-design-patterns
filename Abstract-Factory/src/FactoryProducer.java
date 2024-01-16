public class FactoryProducer
{
    public static Car produceCar(CarType model,Location location)
    {
        Car car=null;
        switch (location)
        {
            case USA:
                car=USACarFactory.buildCar(model);
                break;
            case DEFAULT:
                car=DefaultCarFactory.buildCar(model);
                break;
            case AZERBAIJAN:
                car=AzerbaijanCarFactory.buildCar(model);
                break;

        }
        return car;
    }
}
