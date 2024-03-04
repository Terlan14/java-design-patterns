public class TomatoSouce extends ToppingDecorator{
    TomatoSouce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding dough");
        System.out.println("Adding tomato souce");
    }
    public String getDescription(){
        return tempPizza.getDescription()+" , Tomato Souce.";
    }
    public double getCost(){

        return tempPizza.getCost()+0.75;
    }
}
