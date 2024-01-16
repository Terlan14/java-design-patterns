import java.util.logging.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Weather weather=new Weather();
    weather.addObserver(new Hobbits());
    weather.addObserver(new Orcs());

    weather.timePasses();
    weather.timePasses();
    weather.timePasses();
    weather.timePasses();




    }
}