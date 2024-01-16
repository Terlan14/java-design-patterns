public class BmwSedan implements Sedan
{
    String sedanName;
    @Override
    public void setSedanName(String sedanName)
    {
        this.sedanName=sedanName;
    }

    @Override
    public void drive()
    {
        System.out.println("I am driving "+this.sedanName);
    }
}
