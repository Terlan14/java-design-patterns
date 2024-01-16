public class FordPickup implements Pickup
{
    String pickupName;
    @Override
    public void setPickupName(String pickupName) {
        this.pickupName=pickupName;
    }

    @Override
    public void carry() {
        System.out.println("All stuffs is carried with "+this.pickupName);
    }
}
