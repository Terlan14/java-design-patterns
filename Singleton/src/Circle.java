public class Circle {
    //We have to follow 2 rules
    //1.It should have only single instance
    //2.This instance should be available through global access

    //Step 1:Now we created Circle class which we want to make Singleton
    //Step 2:We should create private default constructor
    private Circle() {}

    //Step 3:Create a private static variable of the Circle class
    //This variable should refer to Circle class

    private static Circle circleInstance=new Circle();

    //Step 4:Create a accessor method which should always return instance of this class we created

    public static Circle getInstance(){
        return circleInstance;
    }

    //Step 5:There should not be any method or constructor which can create instance of this class

}
