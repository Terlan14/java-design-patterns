abstract class Car
{
    Car(CarType model, Location location)
    {
        this.model = model;
        this.location = location;
    }

    abstract void drive();
    CarType model;
    Location location;

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "CarModel - "+model + " located in "+location;
    }
}
