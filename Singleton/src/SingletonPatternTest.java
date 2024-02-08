import java.util.concurrent.Callable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SingletonPatternTest {
    public static void main(String[] args) {

        Circle circle=Circle.getInstance();
        Circle circle2=Circle.getInstance();
        System.out.println(circle);
        System.out.println(circle2);
        //as we see circle anc circle2 refer same place we just create 1 object
    }
}