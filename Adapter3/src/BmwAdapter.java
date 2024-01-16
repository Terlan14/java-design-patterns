public class BmwAdapter implements Sedan{

    Pickup pickup;

    public void setPickup(Pickup pickup) {
        this.pickup = pickup;
    }

    @Override
    public void setSedanName(String sedanName) {

    }

    @Override
    public void drive() {
        pickup.carry();
    }
}
