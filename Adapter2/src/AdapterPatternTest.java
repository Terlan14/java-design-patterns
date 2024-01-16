// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AdapterPatternTest {
    public static void main(String[] args)
    {
        Chargeable appleCharger=new AppleCharger();
        appleCharger.setMobileName("Iphone 6");
        ChargerUtils.doCharge(appleCharger);

        Charger samsungCharger=new SamsungCharger();
        samsungCharger.setMobileName("A71");
        AppleAdapter appleAdapter=new AppleAdapter();
        appleAdapter.setSamsungCharger(samsungCharger);
        ChargerUtils.doCharge(appleAdapter);

    }
}