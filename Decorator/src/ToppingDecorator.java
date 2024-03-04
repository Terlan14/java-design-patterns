abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;
    ToppingDecorator(Pizza newPizza){
        tempPizza=newPizza;
    }
    public String getDescription(){
        return tempPizza.getDescription();
    }
    public double getCost(){

        return tempPizza.getCost();
    }
}
