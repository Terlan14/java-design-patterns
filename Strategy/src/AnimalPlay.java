// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AnimalPlay {
    public static void main(String[] args) {
        Animal rex=new Dog();
        System.out.println("Dog: "+rex.tryToFly());
        Animal pau=new Bird();
        System.out.println("Bird: "+pau.tryToFly());
        rex.setFlyingAbility(new ItFlys());
        System.out.println("Dog: "+pau.tryToFly());
        pau.setFlyingAbility(new CantFly());
        System.out.println("Bird: "+pau.tryToFly());
    }
}