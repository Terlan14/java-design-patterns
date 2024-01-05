// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {
        ShapeFactory shapeFactory=new ShapeFactory();

        Shape shapeS=shapeFactory.getInstance("square");
        shapeS.draw();

        Shape shapeR=shapeFactory.getInstance("rectangle");
        shapeR.draw();

        Shape shapeT=shapeFactory.getInstance("triangle");
        shapeT.draw();

    }
}