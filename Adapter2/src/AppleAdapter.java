public class AppleAdapter implements Chargeable{
    Charger samsungCharger;

    public void setSamsungCharger(Charger samsungCharger) {
        this.samsungCharger = samsungCharger;
    }

    @Override
    public void setMobileName(String mobileName) {
        //empty
    }

    //when we call charge method it calls internally supplyCharge
    @Override
    public void charge() {
        samsungCharger.supplyCharge();
    }
}
