// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ObserverPatternTest
{
    public static void main(String[] args)
    {
        Customer customer1=new Customer();
        customer1.setCustomerName("Terlan");
        Customer customer2=new Customer();
        customer2.setCustomerName("Yusif");

        Product iphone6=new Product();
        iphone6.setProductName("Iphone 6");
        iphone6.setAvailable(false);

        iphone6.registerObserver(customer1);
        iphone6.registerObserver(customer2);

        //after  few days
        iphone6.setAvailable(true);

        iphone6.unregisterObserver(customer1);
        iphone6.setAvailable(true);
        



    }
}