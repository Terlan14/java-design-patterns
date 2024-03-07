// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BridgePattern {
    public static void main(String[] args) {
        Car car=new Car(new Produce(),new Assemble());
        car.manufacture();
        System.out.println();
        Bike bike=new Bike(new Produce(),new Assemble());
        bike.manufacture();

    }
}