public class ShapeFactory
{
    public Shape getInstance(String key)
    {
        if(key==null)
            return null;
        if(key=="square")
            return new Square();
        else if (key=="triangle")
            return new Triangle();
        else if (key=="rectangle")
            return new Rectangle();
        return null;
    }
}
