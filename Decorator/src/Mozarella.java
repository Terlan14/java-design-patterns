public class Mozarella extends ToppingDecorator{
    Mozarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding dough");
        System.out.println("Adding mozarella");
    }
    public String getDescription(){
        return tempPizza.getDescription()+" , Mozarella.";
    }
    public double getCost(){

        return tempPizza.getCost()+0.50;
    }
}
