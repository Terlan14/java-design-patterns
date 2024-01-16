// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Driver driver=new Driver();
        Sedan bmwSedan=new BmwSedan();
        bmwSedan.setSedanName("BMW M5 CS");
        driver.move(bmwSedan);

        Pickup fordPickup=new FordPickup();
        fordPickup.setPickupName("Ford Ranger");
        BmwAdapter bmwAdapter=new BmwAdapter();
        bmwAdapter.setPickup(fordPickup);
        driver.move(bmwAdapter);
    }
}