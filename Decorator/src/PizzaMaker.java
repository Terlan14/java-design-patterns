// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PizzaMaker {
    public static void main(String[] args) {
        Pizza mozarella = new TomatoSouce(new Mozarella(new PlainPizza()));
        System.out.println(mozarella.getCost());
        
    }
}