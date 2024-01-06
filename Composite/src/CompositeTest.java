// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CompositeTest
{
    public static void main(String[] args)
    {
        Leaf ram=new Leaf(50,"RAM");
        Leaf rom=new Leaf(100,"ROM");
        Leaf ssd=new Leaf(50,"SSD");
        Leaf hdd=new Leaf(50,"HDD");
        Leaf cpu=new Leaf(100,"CPU");
        Leaf mouse =new Leaf(40,"Mouse");
        Leaf monitor=new Leaf(60,"Monitor");

        Composite internalMemory=new Composite("Internal Memory");
        Composite externalMemory=new Composite("External Memory");
        Composite processor=new Composite("Processor");
        Composite periphery=new Composite("Periphery");
        Composite base=new Composite("Center");
        Composite computer=new Composite("Computer");

        //leaf objects
        internalMemory.addComponent(rom);
        internalMemory.addComponent(ram);
        externalMemory.addComponent(ssd);
        externalMemory.addComponent(hdd);
        processor.addComponent(cpu);
        periphery.addComponent(monitor);
        periphery.addComponent(mouse);
        //composite objects
        base.addComponent(processor);
        base.addComponent(internalMemory);
        periphery.addComponent(externalMemory);
        computer.addComponent(base);
        computer.addComponent(periphery);

        periphery.showPrice();
        System.out.println("-----------------------");
        base.showPrice();
        System.out.println("------------------------");
        computer.showPrice();



    }
}