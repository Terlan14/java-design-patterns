public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Mixed Pizza";
    }

    @Override
    public double getCost() {
        return 12.00;
    }
}
