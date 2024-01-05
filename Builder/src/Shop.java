// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Shop {
    public static void main(String[] args)
    {
        PhoneBuilder phoneBuilder=new PhoneBuilder();
        Phone phone=phoneBuilder.setOs("IOS").setBattery(4200).getPhone();
        System.out.println(phone);

    }
}