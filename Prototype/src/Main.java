import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {

        BookShop bookShop=new BookShop();
        bookShop.setShopName("Ali & Nino");
        bookShop.loadBook();

        BookShop bookShop1=bookShop.clone();
        bookShop.getBooks().remove(0);
        bookShop1.setShopName("Libraff");
        System.out.println(bookShop);
        System.out.println(bookShop1);
    }
}